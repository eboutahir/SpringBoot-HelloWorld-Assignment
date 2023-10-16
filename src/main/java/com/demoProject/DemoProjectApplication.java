package com.demoProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjectApplication {
    public static int add(int a, int b){

		return a+b;
	}
	public static void main(String[] args) {
		int result = add(3,4);
        System.out.println("The sum is =" + result);
		SpringApplication.run(DemoProjectApplication.class, args);
	}

}
