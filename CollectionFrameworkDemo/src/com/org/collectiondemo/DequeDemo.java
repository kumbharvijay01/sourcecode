/**
 * 
 */
package com.org.collectiondemo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;

/**
 * @author vijaykumbhar
 *
 */
public class DequeDemo {

	public static void main(String args[]) {
		Deque<Integer> deque = new ArrayDeque<>();
//		ArrayDeque<Integer> deque1 = new ArrayDeque<>();
		deque.add(12);
		deque.add(5);
		deque.add(4);
		deque.addFirst(1);
		deque.addLast(10000);
		Integer x = 1;
		System.out.println(deque.contains(x));
//		deque.clear();
		deque.pop();
//		boolean d=deque.isEmpty();
//		System.out.println(d);

		System.out.println(deque);

	}

}
