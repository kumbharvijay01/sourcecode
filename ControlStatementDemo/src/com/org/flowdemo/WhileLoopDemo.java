package com.org.flowdemo;

public class WhileLoopDemo {

	public WhileLoopDemo() {
	}

	public static void main(String[] args) {
		int x = 0;
//		while (x <= -10) {
//			System.out.println(x);
//			x += 2;
//		}
		do {
			System.out.println(x);
			x += 2;
		} while (x <= 10);
		System.out.println("Execution completed");
	}

}
