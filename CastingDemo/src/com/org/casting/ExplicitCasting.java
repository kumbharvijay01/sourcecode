/**
 * 
 */
package com.org.casting;

/**
 * @author vijaykumbhar
 *
 */
public class ExplicitCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float pi = 3.14f;
		int piIntValue = (int) pi;
		double polution = 1111111.04;
		float pFValue = (float) polution;
		System.out.println("PI Value " + pi);
		System.out.println(" Value of pFValue " + pFValue);
		System.out.println(" Value of piIntValue " + piIntValue);
		long polutionValue = (long) polution;
		System.out.println(" Value of polutionValue " + polutionValue);
	}

}
