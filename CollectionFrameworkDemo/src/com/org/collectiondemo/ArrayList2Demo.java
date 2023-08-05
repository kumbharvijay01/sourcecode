/**
 * 
 */
package com.org.collectiondemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class ArrayList2Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> fname = new ArrayList<>();
		List<String> lname = new ArrayList<>();

		fname.add("A");
		fname.add("B");
		fname.add(null);
		fname.add("B");
		fname.add("B");

		fname.add(1, "a");

		lname.add("M");
		lname.add("N");
		lname.add("o");
//		fname.addAll(3, lname);
		System.out.println(fname);
//		fname.clear();
//		System.out.println("After Clear Method");
//		boolean flag = fname.contains("X");
//		System.out.println(fname.containsAll(lname));
		System.out.println(fname.get(0).hashCode());
		System.out.println(fname.getClass());
		System.out.println(fname.hashCode());
		System.out.println(fname.isEmpty());
		System.out.println(fname.toString());
		
//		String d = fname.toString();
//		d = d.replace("B", "b");
//		String s = "A $Sandeep %B Chetan C *Pratap";

//		System.out.println(d);
		
//		System.out.println(fname);
//		for (String v : fname) {
//			System.out.println("Index " + fname.indexOf(v) + " Value =" + v);
//		}
	}

}
