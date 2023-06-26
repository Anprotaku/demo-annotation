package com.example.demo.controller;

import com.example.demo.dto.UserInputDTO;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String home(Model model, HttpSession session) {
        return "index";
    }

    @PostMapping("/post")
    public String login(@ModelAttribute("userInput") @Valid UserInputDTO userInput, BindingResult bindingResult, Model model){
        model.addAttribute("username", userInput.getUsername());
        return "index";
    }

}
