package com.db.spring.boot.demo.aug2021.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.db.spring.boot.demo.aug2021.model.Employee;
import com.db.spring.boot.demo.aug2021.repository.EmployeeRepository;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTests {

	@InjectMocks
	EmployeeService service;

	@Mock
	EmployeeRepository repository;

	public static List<Employee> empList;

	@BeforeAll
	public static void createEmpData() {

		empList = new ArrayList<>();
		empList.add(new Employee(101, "Sonu", 10.5));
		empList.add(new Employee(102, "Monu", 20.5));
		empList.add(new Employee(103, "Tonu", 15.5));
	}

	// @BeforeEach ---

	@Test
	public void testFindAllEmployees() {

		when(repository.findAll()).thenReturn(empList);

		List<Employee> empList2 = service.getAllEmployees();

		assertEquals(3, service.getAllEmployees().size());

		verify(repository, times(2)).findAll();
	}

	@Test
	public void testAddNewEmployee() {
		service.addNewEmployee(empList.get(2));
		verify(repository, times(1)).save(empList.get(2));
	}

	@AfterAll
	public static void nullifyEmpData() {
		empList = null;
	}
}
