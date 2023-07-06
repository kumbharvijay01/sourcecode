package com.org.bhfl.accessdemo;

import java.util.Scanner;

public class ScannerDemo {
	int salary = 10000; // Instance Variable

	static int basic = 10000000;  // Static

	public void getsalary() {

		salary = 100000;
	}

	public void getNetSalary() {
		int netSalary = 103848; // Local Variable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerDemo demo = new ScannerDemo();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = scanner.next();
		System.out.println("Hi " + name);
		System.out.println("Your Salary is " + demo.salary);

		System.out.println("Your BASIC is " + basic);

	}

}
