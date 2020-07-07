package com.js.foodpoint.controller;

import com.js.foodpoint.service.FoodPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/foodPoint")
public class FoodPointController {

    private final FoodPointService foodPointService;

    @Autowired
    public FoodPointController(FoodPointService foodPointService) {
        this.foodPointService = foodPointService;
    }

    @GetMapping("/home")
    public String getAllFoods(Model model){
        model.addAttribute("foodMenu" , this.foodPointService.getAllFoods());
        return "home";
    }
}
