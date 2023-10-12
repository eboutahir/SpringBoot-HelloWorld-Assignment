package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class Hello {
    @RequestMapping("/helo")
    public String hello() {
        return "HelloWorld";
    }

    @GetMapping("/greeting")
    public String greet() {
        LocalDateTime currentTime = LocalDateTime.now();
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();

        if (hour < 12 || (hour == 12 && minute == 0)) {
            return "Good morning";
        } else if (hour < 17 || (hour == 17 && minute == 0)) {
            return "Good afternoon";
        } else {
            return "Good evening";
        }
    }
}
