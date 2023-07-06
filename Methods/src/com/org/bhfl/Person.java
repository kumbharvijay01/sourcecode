/**
 * 
 */
package com.org.bhfl;

/**
 * 
 */

public class Person {

	private int id;
	private String name;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("Person Id " + this.id);
		System.out.println("Person Name " + this.name);
		System.out.println("Person Method Display Called ");
	}
}
