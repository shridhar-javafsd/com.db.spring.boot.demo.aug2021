package com.db.spring.boot.demo.aug2021.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.db.spring.boot.demo.aug2021.model.Employee;
import com.db.spring.boot.demo.aug2021.service.EmployeeService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTests {

	private static Logger LOG = LoggerFactory.getLogger(EmployeeControllerTests.class);

	@Autowired
	MockMvc mockMvc;

	@MockBean
	EmployeeService employeeService;

	public static List<Employee> empList;

	@BeforeAll
	public static void createEmpData() {
		empList = new ArrayList<>();
		empList.add(new Employee(101, "Sonu", 10.5));
		empList.add(new Employee(102, "Monu", 20.5));
		empList.add(new Employee(103, "Tonu", 15.5));
		LOG.info(empList.toString());
	}

	@AfterAll
	public static void nullifyEmpData() {
		empList = null;
//		connection.close();
	}

	@Test
	public void testGetAllEmployees() throws Exception {

		LOG.info("testGetAllEmployees using andExpect()");

//		Mockito.when(methodCall).thenReturn(thisData);

		// returns lock data as real data
		Mockito.when(employeeService.getAllEmployees()).thenReturn(empList);

//		mockMvc.perform(get("/getallemps")).andExpect(status().isOk()); 
//		mockMvc.perform(get("/getallemps")).andExpect(jsonPath("$", Matchers.hasSize(3))); 
//		mockMvc.perform(get("/getallemps")).andExpect(jsonPath("$[*].id", Matchers.containsInAnyOrder(101, 102, 103)));

		mockMvc.perform(get("/getallemps")).andExpect(status().isOk()).andExpect(jsonPath("$", Matchers.hasSize(3)))
				.andExpect(jsonPath("$[*].id", Matchers.containsInAnyOrder(101, 102, 103)));
	}

//	@Test
//	public void testAdd() {
//		EmployeeController controller = new EmployeeController();
//		int expected = 30;
//		int actual = controller.add(10, 20);
//		assertEquals(expected, actual);
//	}
//
//	@Test
//	public void testAdd2() {
//		EmployeeController controller = new EmployeeController();
//		int unexpected = 25;
//		int actual = controller.add(10, 20);
//		assertNotEquals(unexpected, actual);
//	}
//
//	@Test
//	public void testAdd3() {
//		EmployeeController controller = new EmployeeController();
//		int expected = 35;
//		int actual = controller.add(10, 20);
//		assertEquals(expected, actual);
//	}

}
