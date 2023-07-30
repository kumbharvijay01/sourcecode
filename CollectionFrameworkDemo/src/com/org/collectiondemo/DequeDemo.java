/**
 * 
 */
package com.org.collectiondemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

/**
 * @author vijaykumbhar
 *
 */
public class DequeDemo {

	public static void display() {
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		pQueue.add(1);
		pQueue.add(2);
		pQueue.add(3);
		pQueue.add(4);
		pQueue.poll();
		pQueue.offer(55);
		System.out.println(pQueue);
	}

	public static void main(String args[]) {
		display();
		Deque<Integer> deque = new ArrayDeque<>();
//		ArrayDeque<Integer> deque1 = new ArrayDeque<>();
		deque.add(12);
		deque.add(5);
		deque.add(4);
//		deque.addFirst(1);
//		deque.addLast(10000);
//		Integer x = 1;
//		System.out.println(deque.contains(x));
//		deque.clear();
		deque.pop();
		deque.poll();
//		boolean d=deque.isEmpty();
		System.out.println(deque);

		System.out.println(deque);

	}

}
