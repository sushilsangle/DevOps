package com.sushils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApiApplication.class, args);
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("The Addition is"+ c);
	}

}
