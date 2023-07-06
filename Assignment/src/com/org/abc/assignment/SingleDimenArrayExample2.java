/**
 * 
 */
package com.org.abc.assignment;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author vijaykumbhar
 *
 */
public class SingleDimenArrayExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the Subject Marks of " + i + 1);
			a[i] = scanner.nextInt();
		}
		System.out.println("Printing Array ");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Marks obtained by the student in subject " + a[i]);
		}

		System.out.println(a[5]);
	}

}
