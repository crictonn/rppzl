package com.example.rppzl.controller;

import com.example.rppzl.model.Credit;
import com.example.rppzl.repositories.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class CreditController {
    @Autowired
    CreditRepository creditRepository;
    @GetMapping("/credit")
    public String credit(){
        return "credit";
    }

    @PostMapping("/credit")
    public String saveCredit(@ModelAttribute Credit credit){
        creditRepository.save(credit);
        return "redirect:/user";
    }
}
