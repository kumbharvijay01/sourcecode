package com.org.test.utility;

public class EmpSalaryCalculation {

	public int calculateSalary(int basicSalary, String empType) {
		int netSalary = 0;
		if (empType.equalsIgnoreCase("onrole")) {
			netSalary = basicSalary + 50000;
			return netSalary;
		} else {
			netSalary = basicSalary + 20000;
			return netSalary;
		}
	}
}
