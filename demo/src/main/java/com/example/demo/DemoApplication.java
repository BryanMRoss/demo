package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8081");
		System.setProperty("http.maxConnections", "10");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello Spring World!");
	}

	@GetMapping("/crunchify")
	public String heyCrunchify(@RequestParam(value = "name", defaultValue = "there") String crunchify) {
		// check localhost:8081/crunchify  or .../crunchify?name=[something]
		return String.format("Hey %s! Congratulations on your Spring Boot web app!!", crunchify);
	}

}
