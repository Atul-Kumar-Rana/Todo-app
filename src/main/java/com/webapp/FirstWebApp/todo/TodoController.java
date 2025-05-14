package com.webapp.FirstWebApp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class TodoController {

    @Autowired
    private Todoservice todos;

    @RequestMapping("list-order")
    public String listall(ModelMap map) {
        List<todocontent> todo = todos.findbyId(1); // You can change to fetch all
        map.put("values", todo);
        return "listtodo"; // This should resolve to listtodo.jsp or listtodo.html
    }
}
