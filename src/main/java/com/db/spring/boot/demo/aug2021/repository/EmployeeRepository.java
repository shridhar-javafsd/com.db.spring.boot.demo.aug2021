package com.db.spring.boot.demo.aug2021.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.spring.boot.demo.aug2021.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// other custom methods may need to be defined here
	
	public abstract List<Employee> findByFirstName(String firstName);
}
