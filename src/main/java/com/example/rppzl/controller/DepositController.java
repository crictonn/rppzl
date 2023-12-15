package com.example.rppzl.controller;

import com.example.rppzl.model.Credit;
import com.example.rppzl.model.Deposit;
import com.example.rppzl.repositories.DepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class DepositController {
    @Autowired
    DepositRepository depositRepository;
    @GetMapping("/deposit")
    public String deposit(Model model){
        return "deposit";
    }

    @PostMapping("/deposit")
    public String saveCredit(@ModelAttribute Deposit deposit){
        depositRepository.save(deposit);
        return "redirect:/user";
    }
}
