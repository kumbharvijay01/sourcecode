/**
 * 
 */
package com.org.casting;

/**
 * @author vijaykumbhar
 *
 */
public class AutomaticCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte a = 3;
		int x = 100;
		long y = x;
		float f = x;
		double z = f;
		double avalue = a;
		System.out.println(" The value of X :" + x);
		System.out.println(" The value of Y :" + y);
		System.out.println(" The value of f :" + f);
		System.out.println(" The value of z :" + z);
		System.out.println(" The value of avalue :" + avalue);
	}

}
