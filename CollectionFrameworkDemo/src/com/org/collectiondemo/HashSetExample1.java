/**
 * 
 */
package com.org.collectiondemo;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class HashSetExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<Integer> setIntger = new HashSet<>();
		setIntger.add(1);
		setIntger.add(12);
		setIntger.add(14);
		setIntger.add(15);
		setIntger.add(16);
		setIntger.add(1);
		setIntger.add(16);
		setIntger.add(17);
		setIntger.add(19);
		System.out.println(setIntger.toString());

		Set<String> strSet = new HashSet<>();
		strSet.add("ABC");
		strSet.add(null);
		strSet.add("PWR");
		strSet.add("PWR");
		strSet.add("PWR");
		strSet.add("PWR");
		System.out.println(strSet.toString());
		
		strSet.clear();
		System.out.println(strSet.toString());
		setIntger.remove(17);
		System.out.println(setIntger.toString());
		boolean flag=setIntger.contains(15);
		System.out.println(flag);
		
		System.out.println(setIntger.size());
		
		

	}

}
