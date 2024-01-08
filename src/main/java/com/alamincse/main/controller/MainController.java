package com.alamincse.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/")
	public String testController() {
		return "Hello, Spring Boot Developer";
	}

}
