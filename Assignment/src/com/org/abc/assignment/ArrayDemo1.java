/**
 * 
 */
package com.org.abc.assignment;

/**
 * 
 */
public class ArrayDemo1 {

	public static void method1() {
		System.out.println("Method One called ");
	}

	public void method2() {
		System.out.println("Method TWO called ");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello");
		ArrayDemo1 arrayDemo1 = new ArrayDemo1();
		arrayDemo1.method2();
		method1();
	}

}
