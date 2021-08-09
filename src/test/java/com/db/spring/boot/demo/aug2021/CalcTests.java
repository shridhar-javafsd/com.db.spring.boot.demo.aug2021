package com.db.spring.boot.demo.aug2021;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalcTests {

	@Test
	public void testAdd() {

		Calc calc = new Calc();

		int expected = 30;
		int actual = calc.add(10, 20);
		assertEquals(expected, actual);
	}

}
