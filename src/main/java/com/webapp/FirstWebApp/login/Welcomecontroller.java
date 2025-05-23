package com.webapp.FirstWebApp.login;

import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class Welcomecontroller {

    @RequestMapping(value ="/" , method= RequestMethod.GET)
    public String loginPage(ModelMap map) {
        map.put("name",GetLogingUsername());
        return "welcome";
    }
//     to get username          //
    private String GetLogingUsername(){
        Authentication authentication;
        authentication= SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }


}
