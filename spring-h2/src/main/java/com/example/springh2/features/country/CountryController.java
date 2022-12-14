package com.example.springh2.features.country;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {

	@Autowired
	private CountryRepository countryRepository;

	@GetMapping
	public ResponseEntity<List<Country>> listAll() {
		List<Country> countries = new ArrayList<Country>();

		countries = countryRepository.findAll();

		return ResponseEntity.ok(countries);
	}

}
