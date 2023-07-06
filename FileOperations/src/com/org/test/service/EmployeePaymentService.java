/**
 * 
 */
package com.org.test.service;

import com.org.test.employee.Employee;
import com.org.test.utility.FileHandler;

/**
 * @author vijaykumbhar
 *
 */
public class EmployeePaymentService {

	public static void main(String[] args) {
		System.out.println("Hello");
		EmployeePaymentService employeePaymentService = new EmployeePaymentService();
		Employee employee = new Employee();
		FileHandler fileHandler = new FileHandler();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 1; i < 5; i++) {
			employee = new Employee();
			employee.setId(i);
			employee.setAge(i + 20);
			employee.setName("ABC" + i);
			stringBuilder.append(employee.toString() + "\n");
		}
		boolean flag = fileHandler.writeFile("D:\\TestFolder\\employee.txt", stringBuilder.toString());
		flag = fileHandler.writeFile("D:\\TestFolder\\HR.txt", "HR EMPLOYEE DATA");
		System.out.println("flag " + flag);
	}
}
