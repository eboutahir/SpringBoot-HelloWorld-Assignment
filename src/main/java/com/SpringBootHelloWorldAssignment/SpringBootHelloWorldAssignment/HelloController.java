package com.SpringBootHelloWorldAssignment.SpringBootHelloWorldAssignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
//@RequestMapping("/sayhi")
public class HelloController {
    @GetMapping("/hello")
    public String sayHi(){
        int hour = LocalTime.now().getHour();
        if(hour > 12)
            return "Good Morning !";
        else
            return "Hello !";
    }

    @GetMapping("/hello-multiple")
    public String helloMultiple(){
        StringBuilder message = new StringBuilder();
        for(int i=0; i<5; i++)
            message.append("Hello, World !").append(i).append("<br>");
        return message.toString();
    }

    @GetMapping("/greeting")
    public String greeting(){
        int hour = LocalTime.now().getHour();
        if(hour < 12)
            return "Good Morning !";
        else if (hour < 17)
            return "Good afternoon !";
        else
            return "Good evening !";
    }

}
