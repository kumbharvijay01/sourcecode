/**
 * 
 */
package com.org.bhfl.accessdemo;

/**
 * @author vijaykumbhar
 *
 */
public class ChildClass extends ParentClass {

	/**
	 * 
	 */
	public ChildClass() {
		super();
	}

	/**
	 * @param args
	 */

	public void display() {
		System.out.println("Child Method Called");
	}

	public static void main(String[] args) {
		ParentClass parentClass = new ParentClass();
		parentClass.display();
		ParentClass childClass = new ChildClass();
		childClass.display();
	}
}
