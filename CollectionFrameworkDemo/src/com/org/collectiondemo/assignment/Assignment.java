/**
 * 
 */
package com.org.collectiondemo.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class Assignment {

//	public float calculateHra(Employee employee) {
//		return (float) (employee.getBasicSalary() * 0.4);
//	}

	public void calculateHra(Employee employee) {
		employee.setHra((float) (employee.getBasicSalary() * 0.4));
	}

	public void calculateMealPass(Employee employee) {
		employee.setMealPass(1500);
	}

	public void calculateLta(Employee employee) {
		employee.setLta(2000);
	}

	public void calculatePT(Employee employee) {
		employee.setPt(200);
	}

	public void calculatePF(Employee employee) {
		employee.setPf((float) (employee.getBasicSalary() * 0.12));

	}

	public float calculateGrossSalary(Employee employee) {
		return employee.getBasicSalary() + employee.getHra() + employee.getLta() + employee.getMealPass();
	}

	public float calculateNetSalary(Employee employee) {
		return employee.getGrossSalary() - employee.getPf() - employee.getPt();
	}

	public static void main(String[] args) {
		Assignment assignment = new Assignment();
		Scanner scanner = new Scanner(System.in);
		List<Employee> employeeList = new ArrayList<>();

		System.out.println("Enter the number of employee for salary Processing ");
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			Employee employee = new Employee();
			System.out.println(" Enter your employee ID");
			employee.setEmpId(scanner.nextInt());
			System.out.println(" Enter your employee Name");
			employee.setName(scanner.next());
			System.out.println(" Enter your employee Basic Salary");
			employee.setBasicSalary(scanner.nextInt());
			assignment.calculateHra(employee);
			assignment.calculatePF(employee);
			assignment.calculatePT(employee);
			assignment.calculateMealPass(employee);
			assignment.calculateLta(employee);
			float grossSalary = assignment.calculateGrossSalary(employee);
			employee.setGrossSalary(grossSalary);
			float netSalary = assignment.calculateNetSalary(employee);
			employee.setNetSalary(netSalary);
			employeeList.add(employee);

		}
		employeeList.addAll(employeeList);
//		System.out.println(employeeList);
		System.out.println("EMP ID \t EMP Name \t EMP Net Salary");
		for (Employee employee : employeeList) {
			System.out.println(employee.getEmpId() + "\t" + employee.getName() + "\t" + employee.getNetSalary());
			if (employee.getNetSalary() >= 50000) {
				System.out.println("Income Tax SLAB 20 %");
			}
		}
//		System.out.println(employee.getHra());

	}

}
