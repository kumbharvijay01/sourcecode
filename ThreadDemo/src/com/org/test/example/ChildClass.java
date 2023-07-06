/**
 * 
 */
package com.org.test.example;

/**
 * @author vijaykumbhar
 *
 */
public class ChildClass extends Thread {

	@Override
	public void run() {
		System.out.println("ChildClass Thread is running");
		super.run();
	}
	

}
