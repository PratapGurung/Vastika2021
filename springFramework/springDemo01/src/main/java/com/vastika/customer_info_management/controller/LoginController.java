package com.vastika.customer_info_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/home")
    public String getHomePage(){
        return "home";
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

}
