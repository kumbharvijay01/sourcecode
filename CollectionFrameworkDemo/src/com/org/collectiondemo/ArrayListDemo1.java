/**
 * 
 */
package com.org.collectiondemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class ArrayListDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> numberlist = new ArrayList<>();
		List<Integer> numberlist1 = new ArrayList<>();
		List<Integer> numberlist2 = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numberlist.add(i);
		}
		int counter = 10;
		for (int i = 1; i <= 10; i++) {
			counter++;
			numberlist1.add(counter);
		}
		System.out.println(numberlist);
		System.out.println(numberlist1);
		numberlist.addAll(numberlist1);
		System.out.println("After Calling numberlist.addAll(numberlist1);");
		System.out.println("numberlist: " + numberlist);
		System.out.println("numberlist1: " + numberlist1);
		System.out.println(numberlist.indexOf(10));
		numberlist.add(10, 100);
		System.out.println("numberlist: " + numberlist);
//		numberlist1.clear();
		System.out.println("numberlist1: " + numberlist1);
		boolean elementflag = numberlist.contains(100);
		System.out.println("elementflag : " + elementflag);
		System.out.println(numberlist1);

		boolean collectionFlag = !numberlist.containsAll(numberlist2);
		System.out.println("collectionFlag :" + collectionFlag);
		System.out.println(numberlist.equals(numberlist1));
		for (Integer integer : numberlist) {
			System.out.println(integer);
			if (integer == 100) {
				continue;
			}

		}
		numberlist.add(20);
		System.out.println(numberlist.getClass());
		System.out.println(numberlist.hashCode());
		System.out.println(numberlist1.isEmpty());
		System.out.println(numberlist.lastIndexOf(20));
		numberlist.removeAll(numberlist1);
		System.out.println(numberlist1);
		numberlist.remove(1);
		System.out.println("after numberlist.remove(1); " + numberlist);
		numberlist.set(9, 99);
		System.out.println("numberlist.set(9, 99); " + numberlist);

		System.out.println(numberlist.size());
//		Object[] objList=numberlist.toArray();
		
		System.out.println(numberlist.toString());

	}

}
