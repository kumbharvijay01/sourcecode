/**
 * 
 */
package com.org.abc.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author vijaykumbhar
 *
 */
public class Add {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
//		int a = 10;
//		int b = 20;
//		int c = a + b;
//		int d = a - b;
//		int e = a * b;
//		int f = a % b;
//		System.out.print("SUM of Two values " + c);
//		System.out.println("Substraction  " + d);
//		System.out.println("Multliplication  " + e);
//		System.out.println("% " + f);

		File file = new File("D:\\doc.csv");
		Scanner scanner = new Scanner(file);
		Scanner scanner2=new Scanner(file);

//		System.out.println("Enter the 1 Number ");
//		int firstValue = scanner.nextInt();
//
//		System.out.println("Enter the 2 Number ");
//		int secondValue = scanner.nextInt();
//
//		int sum = firstValue + secondValue;
//		System.out.println("Sum of Two Variables is " + sum);
//		System.out.println("" + scanner.nextLine());

		String outString = scanner.nextLine();
		String arr[] = outString.split("|", 4);
	}

}
