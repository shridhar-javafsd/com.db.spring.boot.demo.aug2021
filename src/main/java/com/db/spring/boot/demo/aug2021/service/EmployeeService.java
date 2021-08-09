package com.db.spring.boot.demo.aug2021.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.spring.boot.demo.aug2021.model.Employee;
import com.db.spring.boot.demo.aug2021.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private static Logger LOG = LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	EmployeeRepository repository;

	public List<Employee> getEmployeeByFirstName(String firstName) {
		LOG.info("getEmployeeByFirstName EmployeeService");
		return repository.findByFirstName(firstName);
	}

	public Employee getEmployeeById(int id) {
		LOG.info("getEmployeeById EmployeeService");
//		return new Employee(101, "Sonu", 10.5);
		return repository.findById(id).get();
	}

	public Employee addNewEmployee(Employee employee) {
		LOG.info("addNewEmployee EmployeeService");
		return repository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		LOG.info("getAllEmployees EmployeeService");
		return repository.findAll();
	}

	public Employee updateEmployee(Employee employee) {
		LOG.info("updateEmployee EmployeeService");
		return repository.save(employee);
	}

	public int deleteEmployee(int id) {
		LOG.info("deleteEmployee EmployeeService");
		repository.deleteById(id);
		return id;
	}
}
