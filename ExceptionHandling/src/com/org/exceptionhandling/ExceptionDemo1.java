package com.org.exceptionhandling;

import java.io.File;
import java.util.Scanner;

public class ExceptionDemo1 {

	public int division(int a, int b) {
		try {
			int x = a / b;
			return x;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			return 0;
		} finally {
			System.out.println("Program Executed");
		}
	}

	public int division1(int a, int b) throws Exception {
		int x = a / b;
		return x;
	}

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the a Number Input ");
		int a = scanner.nextInt();

		System.out.println("Enter the b Number Input ");
		int b = scanner.nextInt();

		ExceptionDemo1 exceptionDemo1 = new ExceptionDemo1();
//		System.out.println(exceptionDemo1.division(a, b));
		System.out.println(exceptionDemo1.division1(a, b));

		File file = new File("D:\\error3.html");

		if (file.exists()) {
			System.out.println("File is availabe on Drive");
		} else {
			System.out.println("File is not availabe on Drive");
		}

//		try {
//			System.out.println(exceptionDemo1.division1(a, b));
//		} catch (Exception e) {
//
//		}

	}

}
