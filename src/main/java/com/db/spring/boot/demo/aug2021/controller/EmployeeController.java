package com.db.spring.boot.demo.aug2021.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.db.spring.boot.demo.aug2021.model.Employee;
import com.db.spring.boot.demo.aug2021.service.EmployeeService;

@RestController
public class EmployeeController {

	// HTTP requests - GET, POST, PUT, DELETE
	// CRUD operations - Retrieve, Create, Update, Delete

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeService service;
		
	@GetMapping("/getempbyid/{id}")
	public Employee getEmpById(@PathVariable("id") int id) {
		LOG.info("getEmpById EmployeeController " + id);
	return service.getEmployeeById(id);
	}
	
	
	@PostMapping("/addnewemp")
	public Employee addNewEmp(@RequestBody Employee employee) {
		LOG.info("addNewEmp EmployeeController");
		return service.addNewEmployee(employee);
	}
	
	

//	@PostMapping("/addemp")
//	public Employee addEmp() {
//		LOG.info("emp invoked.");
//	return new Employee(101, "Sonu", 10.5);
//	}
	
	
}
