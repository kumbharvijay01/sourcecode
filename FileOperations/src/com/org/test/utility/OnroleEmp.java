package com.org.test.utility;

public class OnroleEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String empType = "onrole";
		EmpSalaryCalculation empSalaryCalculation = new EmpSalaryCalculation();
		int basicSalary = 10000;
		System.out.println("Net Salary " + empSalaryCalculation.calculateSalary(basicSalary, empType));
		empType = "OffRole";
		basicSalary = 80000;
		System.out.println("Net Salary " + empSalaryCalculation.calculateSalary(basicSalary, empType));
	}
}
