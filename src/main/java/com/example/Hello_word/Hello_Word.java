package com.example.Hello_word;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_Word {
    @GetMapping("/Hello")
    public String hello(){
        return "Hello Word";
    }
}
