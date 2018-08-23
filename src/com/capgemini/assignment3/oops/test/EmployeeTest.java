package com.capgemini.assignment3.oops.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.assignment3.oop.Employee;

class EmployeeTest {

	Employee employee;

	@BeforeEach
	void setUp() {
		employee = new Employee(1234, "Shubham Srivastava", 50000, 1000);
	}

	@Test
	void testEmployee() {
		assertEquals(69800, employee.calculateNetSalary());
	}

	@AfterEach
	void tearDown() {
		employee = null;
	}

}
