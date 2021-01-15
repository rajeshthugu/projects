package com.sports.player.profiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class LoginController {

    @GetMapping("/loginUser")
    public String login(Model model){
        model.addAttribute("login", "login");
        return "loginHome";
    }
}
