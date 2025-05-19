package com.webapp.FirstWebApp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("username")
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
//        System.out.println("Username in controller: " + username);
        map.addAttribute("username",username);
//        map.put("username",username);
        map.put("password",password);
        return "redirect:/list-order";
    }
    else {
        return "errorshow";
    }
    }
}
