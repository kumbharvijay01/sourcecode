/**
 * 
 */
package com.org.collectiondemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author vijaykumbhar
 *
 */
public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		ArrayList<String> list2 = new ArrayList<>();

		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list.size());
		list.add(1, "X");
		list.addFirst("a");

		list.addLast("Y");
		list.add("Z");
		list.add("Z");
		list.add("Z");
		list.add("D");

		System.out.println("Before Callling Clear Method" + list.toString());
//		list.clear();
//		System.out.println("After Calling Clear Method"+list.toString());
//		list.clone();
		if (list.contains("3")) {
			System.out.println(" Found ");
		} else {
			System.out.println(" Not Found ");
		}
		System.out.println(list.toArray());
//		System.out.println(list.removeLast());
		System.out.println("list.removeLastOccurrence(\"Z\")" + list.removeLastOccurrence("D"));
//		list=list.descendingIterator();
//		System.out.println(list.toString());

		System.out.println("Method" + list.toString());
		
		
	}

}
