package com.org.abc.assignment;

import java.util.Scanner;

public class ClassDemo {

	int a;
	int b;
	int sum;

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		this.a = scanner.nextInt();
		System.out.println("Enter Second Number");
		this.b = scanner.nextInt();

	}

	public void display() {
		System.out.println(" a : " + this.a);
		System.out.println(" b : " + this.b);
	}

	public int sum() {
		return sum = this.a + this.b;

	}

	public static void main(String[] args) {

		ClassDemo classDemo = new ClassDemo();
		classDemo.accept();
//		classDemo.display();
		System.out.println(" a : " + classDemo.a);
		System.out.println(" b : " + classDemo.b);
		System.out.println("Sum of a+b : " + classDemo.sum());
	}

}
