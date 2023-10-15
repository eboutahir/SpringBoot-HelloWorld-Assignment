package com.example.Hello_word_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalTime;
@RestController
public class hello_word
{
    @GetMapping("/hello")
    public String Hello(){
                String salutation;

                if ( LocalTime.now().isBefore(LocalTime.NOON)) {
                    salutation = "Good morning";
                } else if ( LocalTime.now().isBefore(LocalTime.of(17, 0))) {
                    salutation = "Good afternoon";
                } else {
                    salutation = "Good evening";
                }
                return "Hello! I am manal ,  " + salutation;
    }
}
