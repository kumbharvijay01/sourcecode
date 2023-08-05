/**
 * 
 */
package com.org.construtor.demo;

import java.io.File;
import java.util.Scanner;

/**
 * 
 */
public class Employee {
	private int empId;
	private String name;
	private boolean empStatus;

	/**
	 * 
	 */
	public Employee() {
		super();
		this.empId = 100;
		this.name = "Ajay";
		this.empStatus = true;
	}

	/**
	 * @param empId
	 * @param name
	 * @param empStatus
	 */
	public Employee(int empId, String name, boolean empStatus) {
		super();
		this.empId = empId;
		this.name = name;
		this.empStatus = empStatus;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", empStatus=" + empStatus + "]";
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) throws Exception {

//		for (int i = 0; i < 500; i++) {
//			Employee employee = new Employee();
//			System.out.println(employee.toString());
//			System.out.println(employee.hashCode());
//		}
//		for (int i = 0; i < 2; i++) {
//			Scanner scanner = new Scanner(System.in);
//			
//			System.out.println("Enter the Employee ID: ");
//			int id = scanner.nextInt();
//
//			System.out.println("Enter the Employee Name: ");
//			String name = scanner.next();
//
//			System.out.println("Enter the Employee Status: ");
//			boolean empStatus = scanner.nextBoolean();
//
//			Employee employee = new Employee(id, name, empStatus);
//			System.out.println(employee.toString());
//
//		}
		Scanner scanner = new Scanner(new File("D:\\doc.csv"));
		while (scanner.next() != null) {
			System.out.println(scanner.next());
		}
	}
}
