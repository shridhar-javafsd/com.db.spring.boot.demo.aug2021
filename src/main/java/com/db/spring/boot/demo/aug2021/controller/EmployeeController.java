package com.db.spring.boot.demo.aug2021.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.db.spring.boot.demo.aug2021.model.Employee;
import com.db.spring.boot.demo.aug2021.service.EmployeeService;

// try swagger 

/**
 * 
 * @author Vaman Deshmukh
 * @since 2.3.1
 *
 */

@RestController
//@CrossOrigin(origins = "localhost:3001")
public class EmployeeController {

	// HTTP requests - GET, POST, PUT, DELETE
	// CRUD operations - Retrieve, Create, Update, Delete

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeService service;

	@GetMapping("/getempbyfirstname/{firstName}")
	public List<Employee> getEmpByFirstName(@PathVariable("firstName") String firstName) {
		LOG.info("getEmpByFirstName EmployeeController " + firstName);
		return service.getEmployeeByFirstName(firstName);
	}

	/**
	 * @param id
	 * @return Employee object
	 * 
	 *         Returns Employee object based in the id value input by end user
	 *         throws ValueNotFoundException
	 * 
	 */

	@GetMapping("/getempbyid/{id}")
	public Employee getEmpById(@PathVariable("id") int id) {
		LOG.info("getEmpById EmployeeController " + id);
		return service.getEmployeeById(id);
	}

	@GetMapping("/getallemps")
	public List<Employee> getAllEmps() {
		LOG.info("getAllEmps EmployeeController ");
		return service.getAllEmployees();
	}

	@PostMapping("/addnewemp")
	public Employee addNewEmp(@RequestBody Employee employee) {
		LOG.info("addNewEmp EmployeeController");
		return service.addNewEmployee(employee);
	}

	@PutMapping("/updateemp")
	public Employee updateEmp(@RequestBody Employee employee) {
		LOG.info("addNewEmp EmployeeController");
		return service.updateEmployee(employee);
	}

	@DeleteMapping("/deleteemp/{id}")
	public int deleteEmp(@PathVariable("id") int id) {
		LOG.info("deleteEmp EmployeeController");
		return service.deleteEmployee(id);
	}

	public int add(int a, int b) {
		LOG.info("add() invoked.");
		return a + b;
	}

}
