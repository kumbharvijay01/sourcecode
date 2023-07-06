/**
 * 
 */
package com.org.bhfl;

/**
 * 
 */
public class Teacher extends Person {

	public int salary;

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Teacher Method Display Called ");

	}

	@Override
	public String toString() {
		return "Teacher [salary=" + salary + ", getId()=" + getId() + ", getName()=" + getName() + "]";
	}

}
