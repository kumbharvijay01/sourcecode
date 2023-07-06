/**
 * 
 */
package com.org.bhfl.accessdemo;

/**
 * @author vijaykumbhar
 *
 */
public class PrivateDemo {
	private String name = "ABC";
	private String address = "PUNE";

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

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateDemo privateDemo = new PrivateDemo();
		System.out.println(privateDemo.name);
		System.out.println(privateDemo.address);
//		System.out.println(privateDemo.getAddress());

	}

}
