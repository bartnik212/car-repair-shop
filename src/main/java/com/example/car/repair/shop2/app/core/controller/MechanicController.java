package com.example.car.repair.shop2.app.core.controller;

import com.example.car.repair.shop2.app.core.model.Mechanic;
import com.example.car.repair.shop2.app.core.model.Seniority;
import com.example.car.repair.shop2.app.module.serviceMechanic.MechanicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Slf4j
@Controller
public class MechanicController {

    private final MechanicService mechanicService;

    public MechanicController(MechanicService mechanicService) {
        this.mechanicService = mechanicService;
    }


    @GetMapping("/landing_page")
    public String getLandingPage(Model model) {
        model.addAttribute("helloSentence", "Witam na mojej stronie do zarządzania warsztatem");

        return "landing_page";
    }

    @GetMapping("/mechanic_add")
    public String getAddMechanic(Model model) {
        model.addAttribute("junior", Seniority.valueOf("JUNIOR"));
        model.addAttribute("mid", Seniority.valueOf("MID"));
        model.addAttribute("senior", Seniority.valueOf("SENIOR"));

        model.addAttribute("seniorities", Seniority.values());

        model.addAttribute("newMechanic", new Mechanic());
        return "mechanics/mechanic_form";
    }

    @PostMapping("/mechanic_add")
    public String postAddMechanic(Mechanic mechanic) {
        mechanicService.save(mechanic);
        log.info("dodany mechanik: " + mechanic);
        return "redirect:/landing_page";
    }



}
