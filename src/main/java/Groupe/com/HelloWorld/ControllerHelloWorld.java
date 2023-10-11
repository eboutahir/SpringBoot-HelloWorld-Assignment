package Groupe.com.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHelloWorld
{
    @GetMapping("/")
    public String helloword()
    {
        return "Hello World !";
    }
}
