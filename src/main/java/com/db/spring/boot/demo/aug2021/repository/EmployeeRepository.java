package com.db.spring.boot.demo.aug2021.repository;

import java.util.List;

import javax.persistence.NamedNativeQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.db.spring.boot.demo.aug2021.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//	public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

	// other custom methods may need to be defined here

	public abstract List<Employee> findByFirstName(String firstName);

	public abstract List<Employee> findBySalary(double salary);

	public abstract List<Employee> findBySalaryGreaterThan(double salary);

	public abstract List<Employee> findBySalaryLessThan(double salary);

	@Query(name = "SELECT e FROM Employee WHERE salary = ?1 and firstName = ?2")
	public abstract List<Employee> findBySalaryAndFirstName(double salary, String firstName);

}
