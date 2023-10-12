package com.SpringBootHelloWorldAssignment.SpringBootHelloWorldAssignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
//@RequestMapping("/sayhi")
public class HelloController {
    @GetMapping("/hello")
    public String sayHi(){
        int hour = LocalTime.now().getHour();
        String msg;
        if(hour > 12)
            msg= "Good Morning !";
        else
            msg= "Hello !";
        return gethtml(msg);
    }

    @GetMapping("/hello-multiple")
    public String helloMultiple(){
        StringBuilder message = new StringBuilder();
        for(int i=0; i<5; i++)
            message.append("Hello, World !").append(i).append("<br>");
        return gethtml(message.toString());
    }

    @GetMapping("/greeting")
    public String greeting(){
        int hour = LocalTime.now().getHour();
        if(hour < 12)
            return gethtml("Good Morning !");
        else if (hour < 17)
            return gethtml("Good afternoon !");
        else
            return gethtml("Good evening !");
    }

    public String gethtml(String msg){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>hello</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: 'Arial', sans-serif;\n" +
                "            background-color: #f4f4f4;\n" +
                "            display: flex;\n" +
                "            align-items: center;\n" +
                "            justify-content: center;\n" +
                "            height: 100vh;\n" +
                "            margin: 0;\n" +
                "        }\n" +
                "\n" +
                "        .hello-world-container {\n" +
                "            text-align: center;\n" +
                "            padding: 20px;\n" +
                "            background-color: #ffffff;\n" +
                "            border-radius: 8px;\n" +
                "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" +
                "        }\n" +
                "\n" +
                "        h1 {\n" +
                "            color: #333333;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"hello-world-container\">\n" +
                "        <h1>"+msg+"</h1>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>\n";
    }
}
