package com.webapp.FirstWebApp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static java.time.LocalDate.now;

@Service
public class Todoservice {
    private static List<todocontent> todos = new ArrayList<>();
    static  int todocount=0;
    static {
        todos.add(new todocontent(++todocount,"atul","practicing", now().plusYears(1),true));
        todos.add(new todocontent(++todocount,"atul","learning", now().plusYears(2),false));
        todos.add(new todocontent(++todocount,"atul","learning", now().plusYears(3),true));
        todos.add(new todocontent(++todocount,"atul","reading", now().plusYears(4),false));
    }
    public List<todocontent> findbyAll(){
        return todos;

    }
    public void addtodo(String user , String desc, LocalDate time, Boolean done){
        todos.add(new todocontent(++todocount,user,desc, time ,done));
    }
    public List<todocontent> findbyusername(String username){
        Predicate<? super todocontent> Predicate=todos->todos.getUsername().equalsIgnoreCase(username);
    return todos.stream().filter(Predicate).toList();
    }
//                     simpler way to do
//public List<todocontent> findbyusername(String username) {
//    List<todocontent> result = new ArrayList<>();
//    for (todocontent todo : todos) {
//        if (todo.getUsername().equalsIgnoreCase(username)) {
//            result.add(todo);
//        }
//    }
//    return result;
//}

    public void deletetodo(int id){
        Predicate<? super todocontent> Predicate=todos->todos.getId()==id;
        todos.removeIf(Predicate);
    }

    public todocontent findbydesc(int id) {
        for(todocontent todo : todos){
            if(id==todo.getId()){
                return todo;
            }
        }
        return null;
    }


    public void update(todocontent updatedTodo) {
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getId() == updatedTodo.getId()) {
                todos.set(i, updatedTodo); // Update the existing Todo at this index
                return;
            }
        }
    }


}
