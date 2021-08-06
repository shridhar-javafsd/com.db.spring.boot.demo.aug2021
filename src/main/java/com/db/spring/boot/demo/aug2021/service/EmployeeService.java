package com.db.spring.boot.demo.aug2021.service;

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

	public Employee getEmployeeById(int id) {
		LOG.info("getEmployeeById EmployeeService");
//		return new Employee(101, "Sonu", 10.5);
		return repository.findById(id).get();
	}

	public Employee addNewEmployee(Employee employee) {
		LOG.info("addNewEmployee EmployeeService");
		return repository.save(employee);
	}

}
