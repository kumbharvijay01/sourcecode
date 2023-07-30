package com.org.collectiondemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Name", "Pratap");
		map.put("Address", "Pune");
		map.put("Country", "India");
		System.out.println(map);

		System.out.println(map.get("Name"));

		System.out.println(map.values());
		System.out.println(map.keySet());
		if (map.containsKey("Name")) {
			System.out.println(map.get("Name"));
		}
		if (map.containsValue("India")) {
			System.out.println(map.get("Country"));
		}
		System.out.println(map.getClass());

		System.out.println(map.hashCode());
		System.out.println(map.get("Name").hashCode());
		System.out.println(map.putIfAbsent("ABF", "BBBB"));

		System.out.println(map);
		Set<String> s = map.keySet();
		System.out.println(s);
		for (String string : s) {
			System.out.println(map.get(string));
		}
		map.remove("ABF");
		System.out.println(map);
		System.out.println(map.replace("Name", "Pratap", "Change"));
		System.out.println(map);
		System.out.println(map);
		

	}

}
