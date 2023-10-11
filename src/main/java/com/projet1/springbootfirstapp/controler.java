package com.projet1.springbootfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controler
{
    @GetMapping("/welcome")
    public String welcome()
    {
        return "<div id='welcome-text' style='font-family: Arial, sans-serif; color: #336699; padding: 10px; border: 2px solid #000; background-color: #f0f0f0; font-size: 24px; text-align: center; position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%);'><h1>Hello World (Spring Boot)</h1></div>"
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

