package com.deepak.spring_security.controller;

import com.deepak.spring_security.models.Users;
import com.deepak.spring_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService service;
    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }
    @PostMapping("register")
    public Users registerUser(@RequestBody Users newUser) {
        return service.registerUser(newUser);
    }
}
