package com.db.spring.boot.demo.aug2021.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.spring.boot.demo.aug2021.model.Employee;

@RestController
public class EmployeeController {

	// HTTP requests - GET, POST, PUT, DELETE
	// CRUD operations - Retrieve, Create, Update, Delete

	
	private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);
	
	@GetMapping("/emp")
	public Employee emp() {
		LOG.info("emp invoked.");
	return new Employee(101, "Sonu", 10.5);
	}

	@PostMapping("/addemp")
	public Employee addEmp() {
		LOG.info("emp invoked.");
	return new Employee(101, "Sonu", 10.5);
	}
}
