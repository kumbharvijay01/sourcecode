/**
 * 
 */
package com.org.controlstatementdemo;

/**
 * @author vijaykumbhar
 *
 */

public class Vehicle {

	private int maxSpeed = 120;

	public Vehicle() {
		System.out.println("Super Class Vehicle Method CAlled;");
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}
