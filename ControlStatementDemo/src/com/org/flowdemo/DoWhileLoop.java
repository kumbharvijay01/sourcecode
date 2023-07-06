package com.org.flowdemo;

public class DoWhileLoop {

	public DoWhileLoop() {
	}

	public static void main(String[] args) {
		int x = 0;
		do {
			System.out.println("x Value is " + x);
			x = x + 2;
		} while (x >= 10000);
	}

}
