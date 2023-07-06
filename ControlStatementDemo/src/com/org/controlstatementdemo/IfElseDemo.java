package com.org.controlstatementdemo;

import java.util.Scanner;

public class IfElseDemo {

	public IfElseDemo() {
	}

	public static void main(String[] args) {
		System.out.println("Enter the Percentage");
		Scanner scanner = new Scanner(System.in);
		float percentage = scanner.nextFloat();
		if (percentage >= 40) {
			System.out.println(" PASS ");

		} else {
			System.out.println(" FAIL ");
		}
	}

}
