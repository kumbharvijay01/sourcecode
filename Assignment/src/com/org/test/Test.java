/**
 * 
 */
package com.org.test;

import java.util.Scanner;

/**
 * @author vijaykumbhar
 *
 */
public class Test {
	public int addition(int a, int b) {
		return a + b;
	}

	public int addition(int a, int b, int c) {
		return a + b + c;
	}

	public double add(int a, int b, int c) {

		return a + b + c;
	}

	public double add(int a, int b) {

		return a + b;
	}

	public static void main(String args[]) {
		Test test = new Test();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int a = scanner.nextInt();

		System.out.println("Enter the 2nd Number");
		int b = scanner.nextInt();

		System.out.println("Enter the 3rd Number");
		int c = scanner.nextInt();

		System.out.println(" Sum of 1st Number and 2nd Number " + test.addition(a, b));
		System.out.println(" Sum of 1st Number , 2nd Number and 3rd Number " + test.addition(a, b, c));
		System.out.println(" By Changing the Return Type as double " + test.add(a, b, c));
	}

}
