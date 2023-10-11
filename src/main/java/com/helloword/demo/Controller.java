package com.helloword.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller{
@RequestMapping(value="/helloword")
public String index(){
    return "Helllo word";
}



}