package project_hello_world.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class HelloWorldController{
    int age=30;
    double price=19.99;
    String greeting="Hell, Java! ";
    Boolean isRaining=false;
    int x=10;
    int y=5;
    int sum =x+y;
    Boolean isGreaterThan=x>y;
    Boolean isTrue=true && false;

    @GetMapping (value= "/helo")
    public String hello(){
        int hour= LocalTime.now().getHour();
        if(hour<18){
            return"Good Morning !";
        }else {
            return "Hello !";
        }
    }
    @GetMapping (value= "/hello-multiple")
    public String helloMultiple(){
        StringBuilder message= new StringBuilder();
        for(int i=0; i<5;i++){
            message.append("Hello world !").append(i).append("<br>");
        }
        return message.toString();
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        int result =add(3,4);
        System.out.println(("the sum is "+ result));
    }
    @GetMapping(value="/time-of-day")
    public String time(){
        LocalTime now = LocalTime.now();
        if(now.isBefore(LocalTime.NOON)){
            return "Good Morning";
        } else if ( now.isBefore(LocalTime.of(17, 0))) {
            return "Good afternoon";
        }else{
            return "Good evening";
        }
    }

}
