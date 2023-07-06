/**
 * 
 */
package com.org.collectiondemo;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author vijaykumbhar
 *
 */
public class HashSetExample {

	public static void main(String args[]) {
//		1 
		Set<Integer> hashset = new HashSet<>();
//		2
		HashSet<Integer> hashset1 = new HashSet<>();
		hashset1.add(1);
		hashset1.add(900);

		System.out.println(hashset.add(100));
		System.out.println(hashset.add(99));
		System.out.println(hashset.add(5));
		System.out.println(hashset.add(1));
		System.out.println(hashset.add(500));
		System.out.println(hashset.add(500));
		System.out.println(hashset.size());

		System.out.println(hashset.getClass());
		ArrayListDemo arrayListDemo = new ArrayListDemo();
		System.out.println(arrayListDemo.getClass());
		hashset.remove(1);
		Integer checkValue = 500;
		System.out.println(" Value Compared using equals Method " + hashset.equals(checkValue));
		System.out.println(hashset);
//		hashset.addAll(hashset1);
//		System.out.println("TreeSET Started Here#######");
////		hashset.clear();
//		TreeSet<Integer> treeset = new TreeSet<>();
//		System.out.println(treeset.add(100));
//		System.out.println(treeset.add(99));
//		System.out.println(treeset.add(5));
//		System.out.println(treeset.add(1));
//		System.out.println(treeset.add(500));
//		System.out.println(treeset.add(500));

//		System.out.println(" After using Add all method : " + treeset);

//		System.out.println("SortedSet  Started Here#######");
//		hashset.clear();

	}
//	100
//	99
//	5
//	1
//	500
//	
//	900

}
