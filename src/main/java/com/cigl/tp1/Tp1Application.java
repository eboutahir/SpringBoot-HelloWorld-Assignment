package com.cigl.tp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Tp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp1Application.class, args);
	}

	@Controller
	public static class HelloWorldController {

		@GetMapping("/")
		public String helloWorld(Model model) {
			model.addAttribute("message", "Hello, World!");
			return "helloworld";
		}
	}
}
