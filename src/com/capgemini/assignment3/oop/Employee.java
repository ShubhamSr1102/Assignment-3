package com.capgemini.assignment3.oop;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeHRA;
	private double employeePF;
	private static double PT = 200;
	private double basicSalary;
	private double grossSalary;
	private double medical;
	private double netSalary;

	Employee() {

	}

	public Employee(int employeeID, String employeeName, double basicSalary, double medical) {
		this.employeeId = employeeID;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

	public double calculateNetSalary() {
		employeeHRA = (0.50 * basicSalary);
		employeePF = (0.12 * basicSalary);
		grossSalary = employeeHRA + basicSalary + medical;
		netSalary = grossSalary - (employeePF + PT);
		return netSalary;
	}

	public void displayEmployeeInformation() {
		System.out.println(
				"Employee Id : " + employeeId + "\nEmployee name: " + employeeName + "\nNet Salary: " + netSalary);
	}

}
