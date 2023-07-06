/**
 * 
 */
package com.org.bhfl;

import java.util.Scanner;

/**
 * 
 */
public class MethodOverLoadingExample {
	public static int x = 1;

	public int addition(int a, int b) {
		return a + b;
	}

	public int addition(int a, int b, int c) {
		return a + b + c;
	}

	public static int addition(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public static void main(String args[]) {

		MethodOverLoadingExample methodOverLoadingExample = new MethodOverLoadingExample();
		System.out.println("Method Running ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st Number for Addtion");
		int a = scanner.nextInt();

		System.out.println("Enter the 2nd Number for Addtion");
		int b = scanner.nextInt();

		System.out.println("Enter the 3 Number for Addtion");
		int c = scanner.nextInt();

		System.out.println("Enter the 4 Number for Addtion");
		int d = scanner.nextInt();

		System.out.println("Addtion of 1st and 2nd Number is  :" + methodOverLoadingExample.addition(a, b));
		System.out.println(
				"Addtion of 1st and 2nd Number and 3rd Number is  :" + methodOverLoadingExample.addition(a, b, c));

		System.out.println("Addtion of 1st and 2nd Number ,3rd Number  and 4th number  is  :" + addition(a, b, c, d));

		System.out.println("Program ends ");
		System.out.println(x);

	}
//
//	public static void main(String args) {
//
//	}
//
//	public static void main() {
//
//	}

}
