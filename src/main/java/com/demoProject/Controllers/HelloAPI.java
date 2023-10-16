package com.demoProject.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;


@Controller
public class HelloAPI {

    @GetMapping("/index")
    public String indexPage(Model model) {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        String gettin=null;

        if(0 < hour  && hour >= 12 && 0 < minute && minute >= 59 ){
            gettin= "Good morning";

        }else if(12 < hour  && hour >= 16 && 0 < minute && minute >= 59){
            gettin= "Good afternoon";
        }else {
            gettin= "Good evening";
        }
      model.addAttribute("message" , gettin);
      return "Hello";

    }
}
