/**
 * 
 */
package com.org.test;

import java.util.Scanner;

/**
 * @author vijaykumbhar
 *
 */
public class AmbiguityProgram {

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(double a, int b) {
		System.out.println(a + b);
	}

	public static void main(String args[]) {
		AmbiguityProgram ambiguityProgram = new AmbiguityProgram();
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		double c = b;
		ambiguityProgram.add(a, b);
		ambiguityProgram.add(c, b);
	}
}
