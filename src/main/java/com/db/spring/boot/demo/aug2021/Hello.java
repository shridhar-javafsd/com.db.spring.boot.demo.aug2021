package com.db.spring.boot.demo.aug2021;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@GetMapping("/hello")
	
	public String hello() {
		return "Hello world!";
	}

	
}
