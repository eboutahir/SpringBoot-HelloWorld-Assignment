package com.ab.abdo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {

    @RequestMapping(value="/bouassel")
    public String helloWorld(Model model) {
        model.addAttribute("message", "salam !");
        return "hello.html";
    }
}
