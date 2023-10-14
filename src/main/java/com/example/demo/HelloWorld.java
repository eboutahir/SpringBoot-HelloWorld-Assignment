package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalTime;

@Controller
public class HelloWorld {

    @GetMapping("/hello")
    public String helloWorld(Model model) {
        int hour = LocalTime.now().getHour();
        String timeOfDay;

        if (hour < 12) {
            timeOfDay = "morning";
        } else if (hour >= 12 && hour < 17) {
            timeOfDay = "afternoon";
        } else {
            timeOfDay = "evening";
        }

        model.addAttribute("timeOfDay", timeOfDay);
        return "hello"; // Cela renvoie le nom du fichier HTML sans extension.
    }
}

