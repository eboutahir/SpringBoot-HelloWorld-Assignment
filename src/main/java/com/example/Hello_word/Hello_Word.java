package com.example.Hello_word;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_Word {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, World";
    }

    @GetMapping("/hello-multiple")
    public String helloMultiple(){

        StringBuilder message = new StringBuilder();
        for(int i = 0; i < 5; i++){
            message.append("Hello, World! ").append(i).append("<br>");
        }
        return message.toString();
    }

}
