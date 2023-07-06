package com.org.flowdemo;

public class BreakStatementDemo {

	public static void main(String[] args) {

		for (int x = 1; x <= 10; x++) {
			if (x == 1) {
				continue;
			}
			System.out.print(" " + x);
		}
//		int a = 10;
//		while (a >= 0) {
//			System.out.println("Variable A value is " + a);
//			a--;
//			if (a == 5) {
//				System.out.println("break statement executed A value is " + a);
//			}
//		}

	}

}
