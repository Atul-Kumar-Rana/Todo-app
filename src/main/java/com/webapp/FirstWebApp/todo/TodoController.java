package com.webapp.FirstWebApp.todo;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("username")
public class TodoController {

    @Autowired
    private Todoservice todos;

    @RequestMapping("list-order")
    public String listall(ModelMap map) {
        String username = (String) map.get("username");
        List<todocontent> todo = todos.findbyAll();
        map.addAttribute("username",username);
        map.put("values", todo);
        return "listtodo";
    }

@RequestMapping(value="add-todos", method = RequestMethod.GET)
public String addingtodo(ModelMap map) {
    todocontent todo = new todocontent(0, (String) map.get("username"), "write description", LocalDate.now().plusYears(1), false);
    map.put("todocontent", todo);
    map.put("mode","add-todos");
    return "addtodo";
}

    @RequestMapping(value="add-todos", method = RequestMethod.POST)
 public String  returntodolist(ModelMap map, @Valid todocontent todo, BindingResult result) {
        if(result.hasErrors()){
            return "addtodo";
        }
        todos.addtodo((String) map.get("username"),todo.getDescription(),todo.getTargetdate(),false);
        return "redirect:list-order";
 }
 @RequestMapping("delete-todo")
    public  String deleteTodo(@RequestParam int id){
        todos.deletetodo(id);
        return "redirect:list-order";
 }


@RequestMapping(value="update-todo", method = RequestMethod.GET)
public String showupdateTodo(@RequestParam int id, ModelMap map) {
    map.put("todocontent", todos.findbydesc(id));
    map.put("mode","update-todo");
    return "addtodo";
}
    @RequestMapping(value="update-todo" ,method=RequestMethod.POST)
    public  String updateTodoback(ModelMap map, @Valid todocontent todo, BindingResult result){
        if(result.hasErrors()){
            return "addtodo";
        }
//        todos.addtodo((String) map.get("username"),todo.getDescription(), LocalDate.now().plusYears(1),false);
          todos.update(todo);
        return "redirect:list-order";
    }
}

