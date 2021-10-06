package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

@GetMapping("/greet/{name}")
public String greetUser(@PathVariable("name") String name) {
	return String.format("Welcome To Singara Chennai, %s ",name);
}

@GetMapping("/")
public String getHome() {
	return "Welcome To UPDATED Home Page of Application";
}



}
