/**
 * 
 */
package com.org.collectiondemo;

import java.util.Vector;

/**
 * 
 */
public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");

		System.out.println(vector.capacity());

	}

}
