/**
 * 
 */
package com.org.abc;

import java.text.NumberFormat;

/**
 * 
 */
public class AbstractDemoPracticeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractDemo abstractDemoPractice = new AbstractDemoPractice();
		abstractDemoPractice.display();
		NumberFormat obj = NumberFormat.getCurrencyInstance();

		System.out.println(obj.format(65));
		System.out.println(obj.format(75));

	}
}
