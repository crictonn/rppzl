package com.example.rppzl.controller;

import com.example.rppzl.model.User;
import com.example.rppzl.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping
    public String user(Model model){
        return "user";
    }

    @PostMapping
    public String saveUser(@ModelAttribute User user){
        userRepository.save(user);
        return "user";
    }
}
