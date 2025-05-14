package com.webapp.FirstWebApp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.LocalDate.now;

@Service
public class Todoservice {
    private static List<todocontent> todos = new ArrayList<>();

    static {
        todos.add(new todocontent(1,"dsa","practicing", now().plusYears(1),true));
        todos.add(new todocontent(2,"aws","learning", now().plusYears(2),false));
        todos.add(new todocontent(3,"Devops","learning", now().plusYears(3),true));
        todos.add(new todocontent(4,"java","reading", now().plusYears(4),false));
    }
    public List<todocontent> findbyId(int id){
        return todos;

    }
}
