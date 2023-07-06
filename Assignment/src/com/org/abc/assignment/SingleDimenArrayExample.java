/**
 * 
 */
package com.org.abc.assignment;

/**
 * @author vijaykumbhar
 *
 */
public class SingleDimenArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[] = { 12, 277, 4343, 235, 62323, 77 };
		

		System.out.println("Index 0 :" + a[0]);
		System.out.println("Index 1 :" + a[1]);
		System.out.println("Index 2 :" + a[2]);
		System.out.println("Index 3 :" + a[3]);
		System.out.println("Index 4 :" + a[4]);
		System.out.println("Index 5 :" + a[5]);
		System.out.println("Size of Array= " + a.length);

		System.out.println("While Loop");
		for (int x = 0; x < a.length; x++) {
			System.out.println(a[x]);
		}
		int y = 0;
		System.out.println("While Loop");
		while (y < a.length) {
			System.out.println(a[y]);
			y++;
			System.out.println(y);
		}

	}

}
