/**
 * 
 */
package com.org.controlstatementdemo;

/**
 * @author vijaykumbhar
 *
 */
public class Car extends Vehicle {

	private int maxSpeed = 240;
	private String brandName;

	public Car() {
		super();
		System.out.println("Car Class Object Cretaed");

	}

	public Car(int maxSpeed, String brandName) {
		super();
		this.maxSpeed = maxSpeed;
		this.brandName = brandName;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = super.getMaxSpeed();
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "Car [maxSpeed=" + maxSpeed + ", brandName=" + brandName + "]";
	}

}
