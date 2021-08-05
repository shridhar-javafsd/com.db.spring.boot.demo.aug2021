package com.db.spring.boot.demo.aug2021.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.spring.boot.demo.aug2021.model.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/emp")
	public Employee emp() {
	return new Employee(101, "Sonu", 10.5);
	}

}
