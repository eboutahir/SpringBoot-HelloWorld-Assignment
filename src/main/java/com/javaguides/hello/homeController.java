package com.javaguides.hello;


import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @GetMapping("/home")
    public String fct(Model model)
    {
        String name="brahim";
        model.addAttribute("name",name);
        return "index";
    }
}
