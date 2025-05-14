package com.webapp.FirstWebApp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Logincontroller {
     @Autowired
     private Auth auth;
    @RequestMapping(value ="login" , method= RequestMethod.GET)
    public String loginPage() {
        return "login";
    }
    @RequestMapping(value ="login" , method= RequestMethod.POST)
    public String logtoPage(@RequestParam String username,@RequestParam String password,ModelMap map) {
    if(auth.auth(username,password)){
        map.put("username",username);
        map.put("password",password);
        return "welcome";}
    else {
        return "errorshow";
    }
    }
}
