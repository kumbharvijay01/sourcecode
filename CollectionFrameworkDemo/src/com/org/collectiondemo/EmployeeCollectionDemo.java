/**
 * 
 */
package com.org.collectiondemo;

import java.util.LinkedList;

/**
 * 
 */
public class EmployeeCollectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Employee> pratap = new LinkedList<>();
		Employee employee = new Employee();
		employee.setEmpId(1);
		employee.setName("Pratap");
		pratap.add(employee);

		employee = new Employee();
		employee.setEmpId(2);
		employee.setName("Raghuvansh");
		pratap.add(employee);

		employee = new Employee();
		employee.setEmpId(3);
		employee.setName("Chetan");
		pratap.add(employee);

		employee = new Employee();
		employee.setEmpId(4);
		employee.setName("Sandeep");
		pratap.add(employee);
//		System.out.println(pratap);
		for (Employee employee2 : pratap) {
			System.out.println(employee2.getEmpId() + " \t " + employee2.getName());

		}

	}

}
