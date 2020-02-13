package com.controller;

import com.entities.Role;
import com.entities.Secret;
import com.entities.ApplicationUser;
import com.repositories.SecretRepository;
import com.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;


@Controller
public class ApplicationController {

    @Autowired
    private SecretRepository secretRepository;
    @Autowired
    private UserRepository userRepository;

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

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(@RequestParam String username, @RequestParam String password, Model model) {
        ApplicationUser userFromDB = userRepository.findByUsername(username);
        if (userFromDB != null) {
            model.addAttribute("message", "user exists");
            return "registration";
        }
        
        ApplicationUser user = new ApplicationUser(username, password);
        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        userRepository.save(user);

        return "redirect:/login";
    }

}
