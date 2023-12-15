package com.example.rppzl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class DepositController {
    @GetMapping("/deposit")
    public String deposit(Model model){
        return "deposit";
    }

}
