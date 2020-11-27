package com.example.car.repair.shop2.app.core.controller;

import com.example.car.repair.shop2.app.core.model.Mechanic;
import com.example.car.repair.shop2.app.module.serviceMechanic.MechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConfigController {


    @Autowired
    private MechanicService mechanicService;


    @GetMapping("/landing_page")
    public String getLandingPage(Model model) {
        model.addAttribute("helloSentence", "Witam na mojej stronie do zarządzania warsztatem");

        return "landing_page";
    }

    @GetMapping("/mechanic_add")
    public String getAddMechanic(Model model) {
        model.addAttribute("newMechanic", new Mechanic());
        return "mechanics/mechanic_form";
    }

    @PostMapping("/mechanic_add")
    public String postAddMechanic(Mechanic mechanic) {
        mechanicService.save(mechanic);

        return "redirect:/landing_page";
    }



}
