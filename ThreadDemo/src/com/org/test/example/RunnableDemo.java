/**
 * 
 */
package com.org.test.example;

import java.util.Date;

/**
 * @author vijaykumbhar
 *
 */
public class RunnableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ImplementingClass implementingClass = new ImplementingClass();
		Thread thread = new Thread(implementingClass);
		try {
			System.out.println("Before Sleep Date and Time " + new Date());
			thread.run();
			thread.sleep(30000);
			System.out.println("After Sleep Date and Time " + new Date());

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		thread.run();
		System.out.println("Date and Time " + new Date());
	}
}
