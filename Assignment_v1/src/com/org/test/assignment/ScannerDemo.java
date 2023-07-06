package com.org.test.assignment;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//	     int i = sc.nextInt();
//	
//		int a = 100;
//		int b = 10;
//		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your 1st Number ");
		int firstNumber = Integer.parseInt(scanner.next());
		System.out.println("Enter your 2nd Number ");
		int secondNumber = Integer.parseInt(scanner.next());
//		System.out.println("Hello Welcome to Java World : " + name);
		System.out.println("Additon of 2 Numbers is: " + (firstNumber + secondNumber));

		

	}

}
