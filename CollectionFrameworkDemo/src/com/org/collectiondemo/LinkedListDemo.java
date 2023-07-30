/**
 * 
 */
package com.org.collectiondemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");

		System.out.println("Before Callling Clear Method" + list.toString());
		if (list.contains("A")) {
			System.out.println(" Found ");
		} else {
			System.out.println(" Not Found ");
		}
		list.removeLastOccurrence("A");
		list.removeLast();
		System.out.println(list);
//		System.out.println("list.removeLastOccurrence(\"Z\")" + list.removeLastOccurrence("D"));
//		list=list.descendingIterator();
//		System.out.println(list.toString());

	}
}
