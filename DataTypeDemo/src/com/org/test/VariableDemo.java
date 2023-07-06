/**
 * 
 */
package com.org.test;

/**
 * @author vijaykumbhar
 *
 */
public class VariableDemo {

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param e
	 * @param f
	 * @param g
	 * @param h
	 */
	public VariableDemo(int a, long b, float c, boolean d, char e, double f, short g, byte h) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		this.g = g;
		this.h = h;
	}

	public int a;
	public long b;
	public float c;
	public boolean d;
	public char e;
	public double f;
	public short g;
	public byte h;

	public VariableDemo(int a, long b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * 
	 */
	public VariableDemo() {

		super();
		System.out.println("Before Assignment " + a);
		a = 100;
	}

	public static void main(String[] args) {
		VariableDemo variableDemo = new VariableDemo();
		int a = 20;
		System.out.println(" Defalut values  ----");
		System.out.println("Class  int a " + variableDemo.a);
		System.out.println("Class  long b " + variableDemo.b);
		System.out.println("Class float c " + variableDemo.c);
		System.out.println("Class boolean d " + variableDemo.d);
		System.out.println("Class char e " + variableDemo.e);
		System.out.println("Class double f " + variableDemo.f);
		System.out.println("Class short g " + variableDemo.g);
		System.out.println("Class byte h " + variableDemo.h);
//		System.out.println("local  a " + a);

//		To Format your code in Ecliplse : CTRL+SHIFT+F

		VariableDemo v1 = new VariableDemo(1000, 5000);
		System.out.println("After calling the Paramater Constructor values of a, b ");
		System.out.println();
		System.out.println("a is " + v1.a);
		System.out.println("b is " + v1.b);

		
	}

}
