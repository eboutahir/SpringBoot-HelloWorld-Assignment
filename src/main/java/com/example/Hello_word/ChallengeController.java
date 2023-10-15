package com.example.Hello_word;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;

@Controller
public class ChallengeController {

    @GetMapping("/Challenge")
    public String challenge(Model model) {
        int hour = LocalTime.now().getHour();
        if (hour < 12) {
            model.addAttribute("message", "Good morning");
        } else if (hour >= 12 && hour < 17) {
            model.addAttribute("message", "Good afternoon");
        } else {
            model.addAttribute("message", "Good evening");
        }
        return "challenge-page";
    }
}
