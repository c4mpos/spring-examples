package com.example.swaggerexample;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@GetMapping("/dashboard")
	public ResponseEntity<Object> index() {
		return ResponseEntity.status(HttpStatus.OK).body(new HashMap<String, String>() {
			{
				put("welcome-message", "Swagger with Spring Boot Example");
				put("swagger-ui", "http://localhost:8080/swagger-ui/");
				put("api-docs", "http://localhost:8080/v3/api-docs");
			}
		});
	}
}
