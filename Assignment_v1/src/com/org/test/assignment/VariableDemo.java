/**
 * 
 */
package com.org.test.assignment;

/**
 * @author vijaykumbhar
 *
 */
public class VariableDemo {

//	Instance Variable
	public int empNo;
	public String empName;
	long a;
//	int salary

//	Static 
	public static int abc = 100;

	public static void sayHello() {
		System.out.println("Hello ");

	}

	public void addtion() {

//		Local Variable
		int a = 10000;
		int b = 10;
		int sum = a + b;
		System.out.println("addtion Method Called for Local Variable:: " + sum);
	}

	public void substraction() {

//		Local Variable
		int a = 10000;
		int b = 10;
		int c = a - b;
		System.out.println("substraction Method Called for Local Variable:: " + c);
	}

	public void multiplication() {

//		Local Variable
		int a = 10000;
		int b = 5;
		int c = a * b;
		System.out.println("multiplication Method Called for Local Variable:: " + c);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		int x = 10;
////		Default Constructor
		VariableDemo variableDemo = new VariableDemo();
//
//		variableDemo.empNo = 100;
//		variableDemo.empName = "ABC";
//		variableDemo.addtion();
//		variableDemo.substraction();
//		variableDemo.multiplication();
//
//		System.out.println("Local Variable inside the Main Method :: " + abc);
		sayHello();

		variableDemo.a = 100l;
		System.out.println(variableDemo.a);

		boolean flag = true;

		System.out.println(flag);

		float pi = 3.14f;

		float r = 5f;
		float radious = pi * r * r;
		System.out.println(radious);

	}

}
