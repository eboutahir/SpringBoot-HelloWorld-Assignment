package com.example.hello;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class hello {
    @GetMapping("/hello")
    public String helloworld(Model model) {
        int hour = LocalTime.now().getHour();
        String message;
        if (hour >= 0 && hour < 12) {
            message = "Good Moring!";

        } else if (hour >= 12 && hour < 17) {
            message = "good afternoon";
        } else {
            message = "Good evening";
        }
        // return "hello it's my first spring boot project";
        model.addAttribute("m", message);
        return "hellowo";
    }
    public String htmlcode(String m) {
        String htmlmessage =
                "<!Doctype html>" + "\n" +
                        "<html>" + "\n" +
                        " <h1>" + m + "</h1>";
        return htmlmessage;

    }
}
