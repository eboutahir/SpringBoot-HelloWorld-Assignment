package com.projet1.springbootfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class controler
{
    @GetMapping("/welcome")
    public String welcome()
    {
        String message="Hello World";
        return affichage(message);
    }
    @GetMapping("/Heloo")
    public String Hello()
    {
         String message;
         int hour = LocalTime.now().getHour();
         if(hour<12)
         {
            message =" Good Morning!";
         }
         else
         {
             message="Hello!";
         }
        return affichage(message);
    }
    @GetMapping("/hello-multiple")
    public String helloMultiple()
    {
        StringBuilder message = new StringBuilder();
        for (int i=0; i< 5; i++)
        {
            message.append("hello World!").append(i).append("<br>");
        }

        return affichage(message.toString());
    }
    @GetMapping("/multiple")
    public String multiple()
    {
        String message;
        int hour = LocalTime.now().getHour();
        if(hour<12)
        {
            message =" Good Morning!";
        } else if (hour<17) {
            message =" Good afternoon!";

        }
        else
        {
            message="Good evening!";
        }
        return affichage(message);
    }

    public static  void main (String[] args)
    {
        int result = add(3,4);
        System.out.println("the sum is"+result);
    }

    public static int add(int a , int b)
    {
        return  a+b;
    }
    public String affichage(String Mssge)
    {
        return "<div id='welcome-text' style='font-family: Arial, sans-serif; color: #336699; padding: 10px; border: 2px solid #000; background-color: #f0f0f0; font-size: 24px; text-align: center; position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%);'><h1>"+Mssge+"</h1></div>"
                // Le script JavaScript pour l'animation.
                + "<script>\n"
                + "const text = document.getElementById('welcome-text').textContent;\n"
                + "document.getElementById('welcome-text').textContent = '';\n"
                + "let index = 0;\n"
                + "const speed = 50; // Vitesse de l'animation (ajustez au besoin).\n"
                + "function typeWriter() {\n"
                + "    if (index < text.length) {\n"
                + "        document.getElementById('welcome-text').textContent += text.charAt(index);\n"
                + "        index++;\n"
                + "        setTimeout(typeWriter, speed);\n"
                + "    }\n"
                + "}\n"
                + "typeWriter();\n"
                + "</script>";
    }

}

