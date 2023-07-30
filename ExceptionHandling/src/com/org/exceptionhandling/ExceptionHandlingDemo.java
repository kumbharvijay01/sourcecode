/**
 * 
 */
package com.org.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author vijaykumbhar
 *
 */
public class ExceptionHandlingDemo {

	public void performDivision() throws Exception {
		int a = 100;
		int b = 0;
		int cal = a / b;
		System.out.println(cal);
	}

	public static void main(String[] args) throws Exception {
//		File myObj = null;
//		Scanner myReader = null;
//		try {
//			myObj = new File("D:\\CommanProps.properties");
//			myReader = new Scanner(myObj);
//			while (myReader.hasNextLine()) {
//				String data = myReader.nextLine();
//				System.out.println(data);
//			}
//			try {
//				int a = 100;
//				System.out.println(a / 1);
//
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//
//			}
//		} catch (FileNotFoundException|NullPointerException e) {
//			System.out.println("An error occurred while reading the file" + e.getMessage());
//			e.printStackTrace();
//
//		} 
//		finally {
////			myReader.close();
//			System.out.println("Execution Completed");
//		}

//		System.out.println(myReader.hasNext());
//		ExceptionHandlingDemo exceptionHandlingDemo = new ExceptionHandlingDemo();
//		exceptionHandlingDemo.performDivision();

		try {
			int a = 100;
			int b = 0;
			int cal = a / b;
			System.out.println(cal);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

		int arr[] = new int[] { 1, 3, 3 };
		String emp = null;
		for (int i : arr) {
			System.out.println(i);

		}
		ArrayList<String> list = new ArrayList<>();
		for (String string : list) {
			System.out.println(string);

		}
		System.out.println(arr[5]);

	}

}
