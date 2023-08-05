package com.org.controlstatementdemo;

import java.util.Scanner;

public class IfDemoExample {

	public boolean checkNumber(int x) {
		if (x >= 0) {
			System.out.println("Number is positive");
			return true;
		} else {
			System.out.println("Number is Negative");
			return false;
		}
	}

	public static void main(String args[]) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the Password");
////
//		String password = "admin";
//		
//		String userPassword = scanner.next();
//		if (password.equals(userPassword)) {
//			System.out.println("You Are admin User");
//			
//		}
//		else
//		{
//			System.out.println("Wrong Password entered");
//		}
//		
//		System.out.println("Exection Completed");

//If Statement always return the booelan values (true/false)

//		Simple If Statement Demo
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the Number to check");
//		Simple If else Statement Demo
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number to check");
		int inputNo = scanner.nextInt();
		IfDemoExample ifDemoExample = new IfDemoExample();
		boolean returnFlag = ifDemoExample.checkNumber(inputNo);
		System.out.println(returnFlag);
	}
}
