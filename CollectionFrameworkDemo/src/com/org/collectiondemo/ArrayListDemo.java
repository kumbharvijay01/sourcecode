/**
 * 
 */
package com.org.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author vijaykumbhar
 *
 */
public class ArrayListDemo {

	public void ArrayLDemo() {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add("A: " + String.valueOf(i));
		}
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("###############");
		list.add("Newly added Value");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println(list.get(5));
		List<String> list1 = new ArrayList<>();
		list1.add("Z");
		list1.add("y");
		list1.add("x");
		if (list1.isEmpty()) {
			System.out.println("List is Empty");
		} else {
			System.out.println("List Contains " + list1.size());
		}
//		list.add(1, "XYZ");

		for (String string : list) {
			System.out.println(string);
		}
		list.addAll(list1);
		for (String string : list) {
			System.out.println(string);
		}

//		list.clear();
		list.remove(6);
		list.remove(7);

		System.out.println("Clear Statement Demo");
		System.out.println(list.toString());
		for (String string : list) {
			System.out.println(string);
		}

	}

	public static void main(String args[]) {

		ArrayListDemo arrayListDemo = new ArrayListDemo();
//		arrayListDemo.ArrayLDemo();
//		int[] intarray = new int[] { 1, 2, 3, 4, 5, 56, 7 };
//		for (int i : intarray) {
//			System.out.println(i);
//
//		}
//		System.out.println("Size of Array " + intarray.length);
//		intarray[8]=5;
//		
//		ArrayList<String> list2 = new ArrayList<>();
//
//		List<String> list = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			list.add("A: " + String.valueOf(i));
//
//		}
//		list.add(null);
//		list.add(null);
//		list.add(null);
////		list.clear();
//
//		System.out.println(list.toString());
//		for (String string : list) {
//			System.out.println(string);
//		}
//		
		

		List<Employee> list = new ArrayList<>();
		Employee employee = new Employee();
		for (int i = 0; i < 10; i++) {
			employee = new Employee();
			employee.setEmpId(i);
			employee.setName("EMPIT:" + i);
			list.add(employee);
		}
		System.out.println(list.size());
		System.out.println(list.toString());
//		Employee e = list.get(2);
//		System.out.println(e.getEmpId());
//		System.out.println(e.getName());
		Employee e = new Employee();
		e.setEmpId(100);
		e.setName("x");
		
		System.out.println(list.contains(e));
		
		for (Employee employee2 : list) {
			System.out.println(employee2.getName());
			
		}

	}

}
