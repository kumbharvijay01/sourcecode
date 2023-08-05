/**
 * 
 */
package com.org.construtor.demo;

import java.util.Scanner;

/**
 * 
 */
public class DeFaultConstructor {

	int a;
	int b;
	static int c = 500;

	/**
	 * 
	 */
	public DeFaultConstructor() {
		super();
		this.a = 10;
		this.b = 40;

	}

	/**
	 * @param a
	 * @param b
	 */
	public DeFaultConstructor(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void sum() {
		System.out.println(this.a + this.b);

	}

	public void sub() {
		System.out.println(this.a - this.b);

	}

	@Override
	public String toString() {
		return "DeFaultConstructor [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		DeFaultConstructor obj1 = new DeFaultConstructor();
		System.out.println("obj1.a: " + obj1.a);
		System.out.println("obj1.b: " + obj1.b);
		System.out.println("--------------------------");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of A");
		int a = scanner.nextInt();// 600
//
		System.out.println("Enter the value of B");
		int b = scanner.nextInt();// 700
		DeFaultConstructor obj2 = new DeFaultConstructor(a, b);
//		a = 0;
//		b = 0;
		System.out.println("obj2.a : " + obj2.a);// 600
		System.out.println("obj2.b : " + obj2.b);// 700
		obj2.sum();// 1300
		obj2.sub();// -100
		obj1.sum();// 40
		obj1.sub();// -30
		System.out.println(a); // 0
		System.out.println(b); // 0
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj1.getClass());

		System.out.println("Obj 1:" + obj1.toString());
		System.out.println("Obj 2:" + obj2.toString());

	}

}
