package com.org.abc.assignment;

import java.util.Scanner;

public class UserInputDemo {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name ");
		// String input
		String name = sc.nextLine();
		System.out.println("User has entered name is  " + name);

		// Character input
		char gender = sc.next().charAt(0);

		// Numerical data input
		// byte, short and float can be read
		// using similar-named functions.
//    int age = sc.nextInt();
//    long mobileNo = sc.nextLong();
//    double cgpa = sc.nextDouble();
//
//    // Print the values to check if the input was correctly obtained.
//    System.out.println("Name: "+name);
//    System.out.println("Gender: "+gender);
//    System.out.println("Age: "+age);
//    System.out.println("Mobile Number: "+mobileNo);
//    System.out.println("CGPA: "+cgpa);
//
	}
}
