/**
 * 
 */
package com.org.flowdemo;

public class Person {

	private int pid;
	private String pname;
	protected String gender;

	public Person() {
		System.out.println("Parent Class Contructor called");
	}

	public void display() {
		System.out.println("Person Object PID: " + pid);
		System.out.println("Person Object PNAME: " + pname);
	}

	/**
	 * @param pid
	 * @param pname
	 */

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}

	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}

	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}

}
