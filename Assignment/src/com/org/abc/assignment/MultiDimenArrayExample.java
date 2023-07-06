/**
 * 
 */
package com.org.abc.assignment;

import java.util.Scanner;

/**
 * @author vijaykumbhar
 *
 */
public class MultiDimenArrayExample {

	public static void main(String args[]) {

		int array1[][] = new int[2][2];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Enter the value for " + i + " " + j + ": ");
				array1[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Printing the 2 D Array ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
