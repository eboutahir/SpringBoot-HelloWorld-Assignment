package com.example.TP11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class helloworld {
    @GetMapping("/hello")
    public String hello(){
        return "hello world";

    }

    public String challenge(){
        int hour = LocalTime.now().getHour();
        if(hour>=00 && hour<12){
            return "Good morning";
        }else if(hour>=12 && hour<17){
            return "Good afternoon";
        }else{
            return "Good evening ";
        }

    }
    @GetMapping("/challenge")
    public String scc(){
        return "<div style='background-color: #f2f2f2;border: 1px solid #ccc;padding: 20px;text-align: center;font-size: 24px;color: #333;font-family: Arial, sans-serif;border-radius: 10px;box-shadow: 2px 2px 5px #888888;'>"+challenge()+"</div>";
    }
    @GetMapping("/calculater")
    public String calculater(){
        return "<script>  function myFunction() {      alert(\"The value is: \" );    }    document.getElementById('calculate').onclick = myFunction; </script> <input id='1' style='width:150px;height:40px;margin-right:10px;'/>" + "+"+"<input id='2' style='width:150px;height:40px;margin-right:10px;margin-left:10px;' /> <button style='height:30px;margin-left:10px;' id='calculate'>calculate </button><input id='3' style='width:150px;height:40px;margin-left:10px;'/>";
    }
}

