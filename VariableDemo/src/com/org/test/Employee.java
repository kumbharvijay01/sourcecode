/**
 * 
 */
package com.org.test;

/**
 * @author vijaykumbhar
 *
 */
public class Employee {

//	 Instance Variable 
	int salary = 1000;
	String name = "ABC";
	
	public static float  pi=3.14f;

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String args[]) {
		// Local variable
		int aa = 10;
		int bb = 20;
		int cc = aa + bb;
		System.out.println("Sum of aa and bb is " + cc);

		Employee employee = new Employee();
		Employee employee1 = new Employee();
//		Shortcut Libarary : ctrl+shift+l 
//Shortcut of formatting code : ctrl+shift+f
//		Accessing direct with Objet
		System.out.println("Accessing direct with Objet");
		System.out.println("Employee Name   " + employee.name);
		System.out.println("Employee Salary   	" + employee.salary);

//		 Accessing using method

		System.out.println("Accessing using method");
		System.out.println("Employee Name   " + employee1.getName());

		System.out.println("Employee Salary   	" + employee.getSalary());

	}

	public void sum() {
		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println("Sum of a and b is " + c);

	}

}
