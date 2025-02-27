package com.security.security.controllers;

import com.security.security.models.User;
import com.security.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> allUsers() {
        return userService.getUsers();
    }

    //getting single User
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username) {
        return userService.getUser(username);
    }

    //adding user
    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

}
