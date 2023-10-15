package com.FSTE.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;
@Controller
public class challengeController {
    @GetMapping("/hello_chalenge")
    public String getGreeting(Model model) {

        LocalTime currentTime = LocalTime.now();
        String msg;
        if (currentTime.isBefore(LocalTime.of(11, 59))&& currentTime.isAfter(LocalTime.of(0, 0)) ) {
            msg = "Good morning";
        } else if (currentTime.isBefore(LocalTime.of(16, 59)) && currentTime.isAfter(LocalTime.of(12, 0))) {
            msg = "Good afternoon";
        } else {
            msg = "Good evening";
        }
        model.addAttribute("msg",msg);
        return "hello";
    }

}
