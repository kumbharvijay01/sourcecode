package com.org.controlstatementdemo;

public class NestedIfDemo {

	public static void main(String[] args) {
		int x = -100;
//		Simple If Statement Demo
//		if (x == 100) {
//			System.out.println("Simple If Statement Demo");
//		}
////		if Else Demo 
//		if (x == 100) {
//			System.out.println("If ELSE Statement Demo");
//		} else {
//			System.out.println();
//		}
//		 Percentange Example for if else if
//		Nested If
		if (x < 100) {
			System.out.println("Nested IF Called 1");
			if (x > 0) {
				System.out.println("Number Provided is positive");
			} else {
				System.out.println("Number Provided is Negative");
			}
		}

	}

}
