/**
 * 
 */
package com.org.flowdemo;

/**
 * @author vijaykumbhar
 *
 */
public class ForLoopDemo {

	public static void main(String args[]) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				System.out.println("Some Random No: " + Math.random());
			}
		}
	}
}
