package com.example.springh2;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@GetMapping("/")
	public ResponseEntity<Object> index() {
		return ResponseEntity.ok(new HashMap<String, String>() {
			{
				put("welcome-message", "Spring Boot with H2");
				put("countries", "http://localhost:8080/countries");
				put("h2-console", "http://localhost:8080/h2-console");
			}
		});
	}

}
