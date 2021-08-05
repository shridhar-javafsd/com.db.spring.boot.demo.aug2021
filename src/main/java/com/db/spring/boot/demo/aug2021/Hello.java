package com.db.spring.boot.demo.aug2021;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	// HTTP requests - GET, POST, PUT, DELETE
	// CRUD operations - Retrieve, Create, Update, Delete

	@GetMapping("/hello") // end-points
	public String hello() {
		return "Hello world!";
	}

	@GetMapping("/hi") // end-points
	public String hi() {

		String hi = "<h1>Hello</h1><p style=\"color : blue\">This is a paragraph.</p>";

		return hi;
	}

}
