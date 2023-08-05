/**
 * 
 */
package com.org.flowdemo;

import java.util.Scanner;

/**
 * @author vijaykumbhar
 *
 */
public class SwitchStatementDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Value of X");
		int x = scanner.nextInt();
//		String operationType = scanner.next();

//		if (x == 1) {
//			System.out.println("You have entered value " + x);
//		} else if (x == 100) {
//			System.out.println("You have HUNDERED");
//		} else {
//			System.out.println("Other VALUES entered");
//		}

//		if (x % 2 == 0) {
//			System.out.println("Values is EVEN");
//			if (x >= 0) {
//				System.out.println("Positive Value");
//			} else {
//				System.out.println("Negative Value");
//			}
//		} else {
//			System.out.println("ODD Value");
//		}
//x: 3
		switch (x) {
		case 1: {
			System.out.println("You have entered value 1 " + x);
//			break;
		}
		case 2: {
			System.out.println("You have entered value 2 " + x);
			break;
		}
		case 3: {
			System.out.println("You have entered value 3 " + x);
			break;
		}
		case 100: {
			System.out.println("You have entered value " + x);
			break;
		}
//		default: {
//			System.out.println("You have entered some Wrong Value");
//		}
		}

		System.out.println("Execution Completed");
		System.out.println("Enter your name");

		String uname = scanner.next();
		switch (uname) {
		case "AJAY": {
			System.out.println("Hello " + uname);
			break;
		}
		case "VIJAY": {
			System.out.println("Hello " + uname);
			break;
		}
		case "NIDA": {
			System.out.println("Hello " + uname);
			break;
		}
		case "SAKSHI": {
			System.out.println("Hello " + uname);
			break;
		}
		case "HRITIK": {
			System.out.println("Hello " + uname);
			break;
		}
		default: {
			System.out.println("Unable to understand the input");

		}
		}
	}

}
