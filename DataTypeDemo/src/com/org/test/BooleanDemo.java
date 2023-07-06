/**
 * 
 */
package com.org.test;

/**
 * @author vijaykumbhar
 *
 */
public class BooleanDemo {

	Boolean employeeStatus;

	/**
	 * @return the employeeStatus
	 */
	public Boolean getEmployeeStatus() {
		return employeeStatus;
	}

	/**
	 * @param employeeStatus the employeeStatus to set
	 */
	public void setEmployeeStatus(Boolean employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public static void main(String[] args) {
		BooleanDemo booleanDemo = new BooleanDemo();
		booleanDemo.setEmployeeStatus(true);
		System.out.println("Employee Status " + booleanDemo.getEmployeeStatus());
	}

}
