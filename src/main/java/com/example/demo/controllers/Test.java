package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	
	@GetMapping("/hi")
	public String test() {
		return "Hello";
	}
}
