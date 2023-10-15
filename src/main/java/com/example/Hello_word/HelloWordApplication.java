package com.example.Hello_word;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HelloWordApplication {

	public static int add(int a,int b){
		return a + b;
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWordApplication.class, args);
		int result = add(3, 4);
		System.out.println("the sum is : "+ result);
	}

}