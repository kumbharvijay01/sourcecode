/**
 * 
 */
package com.org.bhfl.accessdemo;

/**
 * 
 */
public class StaticDemo {
	public void display() {
		System.out.println("Display method called");
	}

	public static void accept() {
		System.out.println("Accept method called without Object ");
	}

	public static void main(String args[]) {
		System.out.println("Program Start");
//		StaticDemo staticDemo = new StaticDemo();
//		staticDemo.display();

//		display();
		accept();

	}

}
