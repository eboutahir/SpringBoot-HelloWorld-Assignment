package com.ab.abdo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class Hello {
    public  static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        int result=add(3,4);
        System.out.println("the sum is : "+result);
    }
    @GetMapping("/hello_multiple")
    public String hellomultiple(){
        StringBuilder message= new StringBuilder();
        for (int i=0;i<5;i++){
            message.append("hello, World!").append(i).append("<br>");
        }
        return message.toString();
    }
}
