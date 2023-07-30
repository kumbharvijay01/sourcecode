/**
 * 
 */
package com.org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class NonPrimitiveExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();

		Integer a;
		Long b;
		Float c;
		Double d;
		Character e;
		Boolean f;
		Short g;
		Byte h;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Anything");
		f = Boolean.parseBoolean(scanner.next());
//		System.out.println(Integer.parseInt(scanner.next()));
		if (f)
			System.out.println("True value entered by the user");
		else
			System.out.println("False value entered by the user");

//		int i = Integer.parseInt("3");
//		if (i > 0) {
//			System.out.println("+ve");
//		} else {
//			System.out.println("-ve");
//		}

	}

}
