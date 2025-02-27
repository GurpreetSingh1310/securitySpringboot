package com.security.security.services;

import com.security.security.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("abc", "abcd", "abc@gmail.com"));
        list.add(new User("ab", "ad", "ac@gmail.com"));
        list.add(new User("abc", "abcd", "abc@gmail.com"));
        list.add(new User("ab", "ad", "ac@gmail.com"));
        list.add(new User("abc", "abcd", "abc@gmail.com"));
        list.add(new User("ab", "ad", "ac@gmail.com"));
        list.add(new User("abc", "abcd", "abc@gmail.com"));
        list.add(new User("ab", "ad", "ac@gmail.com"));
        list.add(new User("abc", "abcd", "abc@gmail.com"));
        list.add(new User("ab", "ad", "ac@gmail.com"));
    }

    //get all users
    public List<User> getUsers() {
        return this.list;
    }

    //get single user
    public User getUser(String email) {
        for (User user : list) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    //add new user
    public User createUser(User user) {
        list.add(user);
        return user;
    }

}


