package com.SpringBootHelloWorldAssignment.SpringBootHelloWorldAssignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sayhi")
public class HelloController {
    @GetMapping
    public String sayHi(){
        return "Hello world";
    }
}
