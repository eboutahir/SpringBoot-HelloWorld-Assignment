package com.vaxim.quickstart;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping(path = "/")
    public String HelloWorld(){
        return "Hello World!";
    }
}
