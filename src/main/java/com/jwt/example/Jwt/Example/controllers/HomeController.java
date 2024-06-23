package com.jwt.example.Jwt.Example.controllers;

import com.jwt.example.Jwt.Example.models.User;
import com.jwt.example.Jwt.Example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("home")
public class HomeController {

    @Autowired //this is property injection
    private UserService userService;

    @GetMapping("user")
    public List<User> getUser(){
        System.out.println("getting users");
        return userService.getUsers();
    }

    @GetMapping("current-user")//for getting current logged In user
    public String getLoggedInUser(Principal principal){
        //Principal is a predefined interface which has the details of current logged In user
    return principal.getName();
    }
}
