package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {

    @RequestMapping("/")
    public String showHello() {
        return "hello-buddy";
    }

    @RequestMapping("/secret")
    public String showSecret() {
        return "secret";
    }

    @RequestMapping("/login")
    public String showLogin() {
        return "login";
    }

}
