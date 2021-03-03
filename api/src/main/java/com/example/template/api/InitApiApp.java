package com.example.template.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.template")
@SpringBootApplication
public class InitApiApp {

	public static void main(String[] args) {
		SpringApplication.run(InitApiApp.class, args);
	}

}
