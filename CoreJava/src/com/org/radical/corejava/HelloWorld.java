/**
 * 
 */
package com.org.radical.corejava;

import java.util.Scanner;

/**
 * 
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Hello World");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st Number ");
		int a = scanner.nextInt();

		System.out.println("Enter 2nd Number ");
		int b = scanner.nextInt();
		int sum = a - b;
		System.out.println(sum);
//		byte, short, int,float, long, double, char, boolean  

	}

}
