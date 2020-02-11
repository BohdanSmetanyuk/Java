package com.controller;

import com.entities.Secret;
import com.repositories.SecretRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ApplicationController {

    @Autowired
    private SecretRepository secretRepository;

    @RequestMapping("/")
    public String showHello() {
        return "hello-buddy";
    }

    @GetMapping("/secret")
    public String showSecret(Model model) {
        Iterable<Secret> secrets = secretRepository.findAll();
        model.addAttribute("secrets", secrets);
        return "secret";
    }

    @RequestMapping("/login")
    public String showLogin() {
        return "login";
    }

    @PostMapping("/secret")
    public String addSecret(@RequestParam String head, @RequestParam String body, Model model) {
        Secret secret = new Secret(body, head);
        secretRepository.save(secret);
        Iterable<Secret> secrets =  secretRepository.findAll();
        model.addAttribute("secrets", secrets);
        return "secret";
    }

}
