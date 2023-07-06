/**
 * 
 */
package com.org.bhfl;

/**
 * 
 */
public class Test {

	public static void main(String args[]) {

		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setName("ABC");
		teacher.setSalary(10000);
		System.out.println(teacher.toString());
		teacher.display();
		Person p = new Person();
		p.display();

	}

}
