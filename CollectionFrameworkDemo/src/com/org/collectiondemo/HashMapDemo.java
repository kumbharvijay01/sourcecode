/**
 * 
 */
package com.org.collectiondemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vijaykumbhar
 *
 */
public class HashMapDemo {

	public static void main(String args[]) {
		HashMap<String, String> hashMap = new HashMap<>();
		HashMap<String, String> newhashMap = new HashMap<>();
		HashMap<Integer, String> hashMap1 = new HashMap<>();
		HashMap<Integer, Employee> hashMap2 = new HashMap<>();

		Employee employee = new Employee();
		employee.setEmpId(1);
		employee.setName("Sachin");
		hashMap2.put(employee.getEmpId(), employee);
		
		employee = new Employee();
		employee.setEmpId(2);
		employee.setName("ABC");
		hashMap2.put(employee.getEmpId(), employee);
		employee = new Employee();
		employee.setEmpId(3);
		employee.setName("PQUR");
		hashMap2.put(employee.getEmpId(), employee);

//		System.out.println("Object Demo HashMAP : " + hashMap2);
//		System.out.println("Size of HashMAP " + hashMap2.size());
		Employee employee2 = null;
		
		for (Map.Entry<Integer, Employee> identifier : hashMap2.entrySet()) {
			// Printing keys
//			System.out.print(me.getKey() + ":");
//			System.out.println(me.getValue());
			employee2 = hashMap2.get(identifier.getKey());
			System.out.println(employee2.getEmpId());
			System.out.println(employee2.getName());
			if(employee2.getName()=="ABC")
			{
				System.out.println("Condition OK");
			}
			
				

		}

//		hashMap1.put(65, "a");
//		hashMap1.put(65, "b");
//		System.out.println(hashMap1);
////		ArrayList 1
////		HashMap<String, String> hashMap=new HashMap<>(); 16 12 32
//
//		hashMap.put("name", "Sachin");
//		hashMap.put("Address", "Hinjewadi");
//		hashMap.put("City", "Pune");
//		hashMap.put("name", "Yogesh");
//
//		newhashMap.put("A", "a");
//		newhashMap.put("B", "b");
//		newhashMap.put("C", "c");
//
//		System.out.println(hashMap.size());
//		System.out.println("hashMap.containsKey(\"name\")  :" + hashMap.containsKey("name"));
//		System.out.println(hashMap);
//		hashMap.putAll(newhashMap);
//		hashMap.replace("A", "X");
//		hashMap.replace("B", "b", "Y");
//		hashMap.putIfAbsent("X", "NEW");
//		System.out.println(hashMap.containsValue("Pune"));
//
//		System.out.println("newly added hashmap using put all method" + hashMap);
//		String name = "SachinXYZ";
//		System.out.println(hashMap2.containsValue("SachinXYZ"));

	}
}
