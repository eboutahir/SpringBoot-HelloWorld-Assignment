package com.javaguides.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class hellocontroller {
@GetMapping("/hello")
    public String hello(){
        int h= LocalTime.now().getHour();
        if(h>=0 && h<12){
            return "Good Morning";
        }
        else if(h>=12 && h<17){
            return "Good Afternoon";
        }
        else
            return "Good evening";
    }
}
