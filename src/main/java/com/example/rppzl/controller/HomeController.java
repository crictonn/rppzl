package com.example.rppzl.controller;


import com.example.rppzl.model.User;
import com.example.rppzl.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("user", new User());
        return "home";
    }
    @PostMapping("/")
    public String submitUser(@ModelAttribute User user){
        userRepository.save(user);
        return "redirect:/user";
    }
}
