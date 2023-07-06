/**
 * 
 */
package com.org.bhfl.accessdemo;

/**
 * @author vijaykumbhar
 *
 */
public class DefaultDemoTest {
	public static void main(String args[]) {
		DefaultDemo defaultDemo = new DefaultDemo();
		defaultDemo.id = 10;
//		defaultDemo.name="ABC";
		System.out.println(defaultDemo.id);
		System.out.println(defaultDemo.getName("ABC"));
	}
}
