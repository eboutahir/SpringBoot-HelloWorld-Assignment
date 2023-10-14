package com.cigl.tp1.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String getPersonalizedGreeting(Model model) {
        LocalTime currentTime = LocalTime.now();
        String greeting;

        if (currentTime.isBefore(LocalTime.NOON)) {
            greeting = "Good morning";
        } else if (currentTime.isBefore(LocalTime.of(17, 0))) {
            greeting = "Good afternoon";
        } else {
            greeting = "Good evening";
        }

        model.addAttribute("greeting", greeting);
        return "greeting";
    }
}
