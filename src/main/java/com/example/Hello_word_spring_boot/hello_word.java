package com.example.Hello_word_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello_word
{
    @GetMapping("/hello")
    public String Hello(){
        return("Hello, World!");
    }
}
