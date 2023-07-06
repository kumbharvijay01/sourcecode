/**
 * 
 */
package com.org.flowdemo;

/**
 * @author vijaykumbhar
 *
 */
public class ForeachDemo {

	/**
	 * 
	 */
	public ForeachDemo() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int intArray[] = { 1, 3, 4, 5, 7, 7, 4, 4 };
		String arrName[] = { "a", "b", "x", "w" };
		for (int a = 0; a < arrName.length; a++) {
			System.out.print(" " + arrName[a]);
		}
		System.out.println();
		System.out.println("Enhance For Loop");
		for (String string : arrName) {
			System.out.print(" " + string);
		}
//		int x = 10;
//		System.out.println("Sr No ");
//		for (int i = 1; i < 10; i++) {
//			System.out.println(i);
//		}

//		for (int i = 100; i >= 1; i--) {
//			System.out.println(i);
//		}

//		Prime Number: 1,3,5,7,9,11
//		Armstrong Number: 153 
//		Odd Even

	}

}
