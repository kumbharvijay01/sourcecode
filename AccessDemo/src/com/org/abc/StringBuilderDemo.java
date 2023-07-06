/**
 * 
 */
package com.org.abc;

/**
 * 
 */
public class StringBuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("ABC");
		System.out.println(builder.reverse());
		System.out.println(builder.charAt(0));
		System.out.println(builder.length());
	}
}
