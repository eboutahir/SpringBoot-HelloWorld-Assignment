package com.demoProject.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/demo")
@AllArgsConstructor
public class HelloAPI {

    @GetMapping("/index")
    public String indexPage(Model model) {
        return "Hello";
    }
}
