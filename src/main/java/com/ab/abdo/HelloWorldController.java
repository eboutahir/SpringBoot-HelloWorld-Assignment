package com.ab.abdo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@Controller
public class HelloWorldController {

    @RequestMapping(value="/bouassel")
    public String helloWorld(Model model) {
        int hour= LocalTime.now().getHour();
        if(hour <=11){
            model.addAttribute("message", "Good morning");
            return "sun";
        }
        else if (hour <= 16){
            model.addAttribute("message", "Good afternoon");
            return "sun";
        }
        else {
            model.addAttribute("message", "good evening");
            return "sun";
        }

    }
}
