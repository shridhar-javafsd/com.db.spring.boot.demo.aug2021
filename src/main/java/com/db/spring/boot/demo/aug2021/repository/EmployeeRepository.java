package com.db.spring.boot.demo.aug2021.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.spring.boot.demo.aug2021.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// other custom methods may need to be defined here
}
