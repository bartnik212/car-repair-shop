package com.example.car.repair.shop2.app.core.controller;

import com.example.car.repair.shop2.app.core.model.Mechanic;
import com.example.car.repair.shop2.app.core.model.Order;
import com.example.car.repair.shop2.app.module.serviceMechanic.MechanicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OrderController {

    private final Order order = new Order();

    private final MechanicService mechanicService;

    public OrderController(MechanicService mechanicService) {
        this.mechanicService = mechanicService;
    }

    @GetMapping("/order_add")
    public String getOrder(Model model){

        model.addAttribute("mechanicList", mechanicService.findAllMechanics());
        model.addAttribute("newOrder", new Order());

        return "order_form";
    }
}
