/**
 * 
 */
package com.org.bhfl.accessdemo;

/**
 * @author vijaykumbhar
 *
 */
class DefaultDemo {

	int id;
	String name;
	String address;
	String city;

	public String getName(String name) {
		return "Hi " + name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultDemo defaultDemo = new DefaultDemo();
		defaultDemo.id = 10;
//		defaultDemo.name="ABC";
		System.out.println(defaultDemo.id);
		System.out.println(defaultDemo.getName("ABC"));

	}

}
