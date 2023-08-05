package com.org.controlstatementdemo;

import java.util.Scanner;

public class LadderIfDemo {

	public static void main(String[] args) {
		System.out.println("Enter the Percentage");
		Scanner scanner = new Scanner(System.in);
		float percentage = scanner.nextFloat();// 55
//		if (percentage < 40) {
//			System.out.println(" FAIL ");
//		} else if (percentage >= 40 && percentage <= 60) {
//			System.out.println(" Second Class ");
//		} else if (percentage > 60 && percentage <= 75) {
//			System.out.println(" First Class ");
//		} else {
//			System.out.println(" First with Distinction ");
//		}

		if (percentage >= 75 && percentage < 100) {
			System.out.println(" First with Distinction ");
		} else if (percentage < 75 && percentage >= 60) {
			System.out.println(" First Class ");
		} else if (percentage < 60 && percentage > 40) {
			System.out.println(" Second Class ");
		} else {
			System.out.println(" FAIL ");
		}

	}
}
