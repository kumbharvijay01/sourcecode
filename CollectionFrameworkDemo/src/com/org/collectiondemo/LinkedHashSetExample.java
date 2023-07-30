package com.org.collectiondemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String args[]) {
		Set<String> strSet = new LinkedHashSet<>();
		strSet.add("ABC");
		strSet.add(null);
		strSet.add("PWR");
		strSet.add("we");
		strSet.add("pkd");
		strSet.add("ab");
		strSet.add("PWR");
		System.out.println(strSet);
	}
}
