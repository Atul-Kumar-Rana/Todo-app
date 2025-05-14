package com.webapp.FirstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class screencontroller {
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayhello(){

        return "ka ji kyakr rha"
                ;
    }
}
