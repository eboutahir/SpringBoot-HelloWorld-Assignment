package com.example.FirstProjectSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalTime;

@RestController
public class HelloWorld {
    @GetMapping("/HelloW")
    public String Hello(){
        return "Hello world!";
    }
//    //Declaration of variables
//    int age = 30;
//    double price = 19.99;
//    String greeting = "Hello, Java!";
//    int x = 10;
//    int y = 5;
//    int sum = x + y;
//    boolean isCreaterThan = x > y;
//    boolean isTrue = true && false;
//    @RequestMapping("/Hello-m")
//
//    public String hello() {
//        int  hour = LocalTime.now().getHour();
//        if (hour < 12){
//            return "Good morning";
//        } else {
//            return "Hello!";
//        }
//
//    }
//    @RequestMapping("/hello-multiple")
//    public String helloMultiple(){
//        StringBuilder message = new StringBuilder();
//        for (int i = 0 ; i < 5 ; i++){
//            message.append("Hello, World!").append(i).append("<br>");
//        }
//        return message.toString();
//    }
//    public static int add(int a, int b){
//        return a + b;
//    }
//    public static void main(String[] args){
//        int result = add(3,4);
//        System.out.println("The sum is :"+ result);
//    }
//    //First method we use html directly in the same page of controller
//    @RequestMapping("/hello")
//    public String HelloWorld(){
//        int hour = LocalTime.now().getHour();
//        if( hour > 00 && hour < 12 ){
//            return generateHtmlPage("Good morning!");
//        } else if ( hour > 12 && hour < 17){
//            return generateHtmlPage("Good afternoon!");
//        }else {
//            return generateHtmlPage("Good evening!");
//        }
//    }
//
//    private String generateHtmlPage(String content) {
//        String htmlContent = "<!DOCTYPE html>\n" +
//                "<html>\n" +
//                "<head>\n" +
//                "    <title>Generated HTML Page</title>\n" +
//                "</head>\n" +
//                "<body>\n" +
//                "    <h1>" + content + "</h1>\n" +
//                "</body>\n" +
//                "</html>";
//        return htmlContent;
//    }
    //The second method we use it separately
    @GetMapping("/greeting")
    public String  greeting(Model model) {
        int hour = LocalTime.now().getHour();
        String hello;
        if (hour >= 00 && hour < 12) {
            hello = "Good morning!";
        } else if (hour >= 12 && hour < 17) {
            hello = "Good afternoon!";
        } else {
            hello = "Good evening!";
        }
        model.addAttribute("message", hello);
        return "hello";
    }



}
