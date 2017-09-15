package com.pbd1.proybd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.pbd1.proybd")
public class ProybdApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProybdApplication.class, args);
	}
}
