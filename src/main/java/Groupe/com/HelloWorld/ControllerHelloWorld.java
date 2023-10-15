package Groupe.com.HelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@Controller
public class ControllerHelloWorld
{
    int age =30;
    double price=19.99;
    String greeting="Hello,Java!";
    boolean isRaining=false;


    @RequestMapping("/hello")
    public String helloword(Model model)
    {
        String MessageGreeting, message;
        int hour = LocalTime.now().getHour();
        int minute = LocalTime.now().getMinute();

        if(hour>= 0 && hour< 12)
        {
            MessageGreeting="Good morning!";
        }
        else if(hour>=12 && hour < 17)
        {
            MessageGreeting="Good afternoon";
        }
        else {
            MessageGreeting="Good evening";
        }
        message = hour+":"+minute;

        model.addAttribute("greeting",MessageGreeting);
        model.addAttribute("time",message);
        return "helloWorld";

    }

    /*@GetMapping("/hello-multiple")
    public String helloMultiple()
    {
       StringBuilder message = new StringBuilder();
        for(int i=0;i<5;i++)
        {
            message.append("Hello;World!").append(i).append("<br>");
        }

            return message.toString();
    }*/



}
