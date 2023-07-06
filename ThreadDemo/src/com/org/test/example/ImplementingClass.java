/**
 * 
 */
package com.org.test.example;

import java.util.Date;

/**
 * @author vijaykumbhar
 *
 */
public class ImplementingClass implements Runnable {

	@Override
	public void run() {

		System.out.println("Theread Date date is " + new Date());

//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i++);
//		}

	}

}
