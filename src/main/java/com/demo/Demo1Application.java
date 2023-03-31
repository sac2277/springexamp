package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {
	@GetMapping("/")
	public String welcome() {
		return "Welcome to open shift";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
