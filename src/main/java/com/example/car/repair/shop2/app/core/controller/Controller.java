package com.example.car.repair.shop2.app.core.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/landing_page")
    public String getLandingPage(Model model) {
        model.addAttribute("helloSentence", "Witam na mojej stronie do zarządzania jebanym warsztatem");

        return "landing_page";
    }
}
