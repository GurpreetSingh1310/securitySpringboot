package com.security.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

    @GetMapping("/home")
    public String Home() {
        return "I'm home";
    }

    @GetMapping("/login")
    public String Login() {
        return "I'm login";
    }

    @GetMapping("/register")
    public String Register() {
        return "I'm register";

    }
}