package com.webapp.FirstWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class Auth {
    public  boolean auth(String username , String password){
        boolean user=username.equalsIgnoreCase("atul");
        boolean pass=password.equalsIgnoreCase("admin");

        return user && pass;
    }
}
