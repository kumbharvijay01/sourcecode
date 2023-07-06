package com.org.flowdemo;

public class ContDemo {

	public ContDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		for (int i = 0; i <= 2; i++) {
			for (int j = i; j <= 5; j++) {
				continue;
			}
			System.out.println(i);
		}
	}
}
