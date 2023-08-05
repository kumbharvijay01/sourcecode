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
		Set<Integer> hashset = new HashSet<>();

		
		System.out.println(hashset.add(100));
		System.out.println(hashset.add(99));
		System.out.println(hashset.add(5));
		System.out.println(hashset.add(1));
		System.out.println(hashset.add(500));
		System.out.println(hashset.add(500));

		System.out.println("--------------");
		System.out.println(hashset.add(null));
		System.out.println(hashset.add(null));
		System.out.println(hashset.size());
		System.out.println(hashset);
		System.out.println(hashset.remove(null));
		System.out.println("--------------");

//		System.out.println(hashset.getClass());
////		ArrayListDemo arrayListDemo = new ArrayListDemo();
////		System.out.println(arrayListDemo.getClass());
//		hashset.remove(1);
//
//		System.out.println(hashset);
////		Integer checkValue = 500;
////		System.out.println(" Value Compared using equals Method " + hashset.equals(checkValue));
////		System.out.println(hashset);
////		hashset.addAll(hashset1);
////		System.out.println("TreeSET Started Here#######");
//////		hashset.clear();
////		TreeSet<Integer> treeset = new TreeSet<>();
////		System.out.println(treeset.add(100));
////		System.out.println(treeset.add(99));
////		System.out.println(treeset.add(5));
////		System.out.println(treeset.add(1));
////		System.out.println(treeset.add(500));
////		System.out.println(treeset.add(500));
//
////		System.out.println(" After using Add all method : " + treeset);
//
////		System.out.println("SortedSet  Started Here#######");
////		hashset.clear();

	}

}
