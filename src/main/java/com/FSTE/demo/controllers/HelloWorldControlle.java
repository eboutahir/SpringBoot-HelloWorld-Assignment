package com.FSTE.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
@RestController

public class HelloWorldControlle {
    int age=30;
    double price=19.99;
    String greeting ="hello,java";
    boolean isRaining=false;
    int x=10;
    int y=5;
    int sum=x+y;
    boolean isGeathen=x > y;
    boolean isTrue= true && false;




    @GetMapping("/hello")
    public String hello() {
        int hour= LocalTime.now().getHour();
        if (hour <12){
            return "Good morning !";
        }else {
            return "Hello";
        }
    }
    @GetMapping("/hello-multiple")

    public String helloMultiple(){
        StringBuilder message= new StringBuilder();
        for (int i=0;i<5;i++){
            message.append("Hello,World !").append(i).append("<br>");
        }
        return message.toString();
    }
    public static int  add(int a,int b) {
        return a+b;
    }

}
