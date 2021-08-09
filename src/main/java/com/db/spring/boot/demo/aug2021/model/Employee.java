package com.db.spring.boot.demo.aug2021.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

//@NamedNativeQuery(name="")
@Entity
public class Employee {

	@Id // primary key
	@Column
	private int id;
	@Column
	private String firstName;
	@Column
	private double salary;

// getters, setters, constructors, toString

	public Employee() {
		super();
	}

	public Employee(int id, String firstName, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}
