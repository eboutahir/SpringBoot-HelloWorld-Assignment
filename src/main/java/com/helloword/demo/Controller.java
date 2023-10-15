package com.helloword.demo;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller{
@RequestMapping(value="/helloword")
public String index(){
    return "<html>" + 
            "<head>" + 
            "    <style>" + 
            "        @keyframes moveText {\r\n" + 
            "            0% { transform: translateX(0); }" + 
            "            50% { transform: translateX(100px); }" + 
            "            100% { transform: translateX(0); }" + 
            "        }" + 
            "        body {" + 
            "            display: flex;" + 
            "            justify-content: center;" + 
            "            align-items: center;" + 
            "            height: 100vh;" + 
            "            margin: 0;" + 
            "        }" + 
            "        h1 {" + 
            "            color: red;" + 
            "            font-size: 110px;" + 
            "            animation: moveText 5s infinite;" + 
            "        }" + 
            "    </style>" + 
            "</head>" + 
            "<body>" + 
            "    <h1>Hello World</h1>" + 
            "</body>" + 
            "</html>";


    
}
@GetMapping(value="/time")
public String hello(){

int houre=LocalTime.now().getHour();
String imageTag = "";
if (houre < 00 && houre > 11) {
    
imageTag = "<img src='/image/g.jfif' alt='Good morning' style='display: block; height: 90vh;margin: 0 auto;'>";
}
    else if(houre> 12 && houre<17){
imageTag = "<img src='/image/after.jfif' alt='Good afternon' style='display: block; height: 90vh;margin: 0 auto;'>";
}
 else{ 
  
 imageTag = "<img src='/image/eve.jfif' alt='Good evening' style='display: block; height: 90vh;margin: 0 auto;'>";
    
 }

 return imageTag;

}
}