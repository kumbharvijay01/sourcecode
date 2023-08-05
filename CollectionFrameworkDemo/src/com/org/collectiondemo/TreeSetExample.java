/**
 * 
 */
package com.org.collectiondemo;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */
public class TreeSetExample {
	public static void main(String[] args) {
		Set<Integer> integers = new TreeSet<>();
		integers.add(100);
		integers.add(1);
		integers.add(900);
		integers.add(600);
		integers.add(500);
		integers.add(0);
		integers.add(500);
		System.out.println(integers);
	}
}
