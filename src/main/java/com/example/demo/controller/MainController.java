package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@GetMapping(value = "/")
	public String main() {
		
		logger.info("hello");
		return "{\"msg\":\"OK\"}";
	}
}
