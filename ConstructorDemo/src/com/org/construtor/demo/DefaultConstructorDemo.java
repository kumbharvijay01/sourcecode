/**
 * 
 */
package com.org.construtor.demo;

/**
 * @author vijaykumbhar
 *
 */
public class DefaultConstructorDemo {

	public int x;
	boolean flag;
	public static int marks;
	char ch;

	/**
	 * 
	 */
	public DefaultConstructorDemo() {
		super();
		System.out.println("Default Contructor called by the JVM");
		
	}
	
	

//	DefaultConstructorDemo() {
//		x = 2000;
//		flag = true;
//		marks = 400;
//
//		System.out.println("Default Constructor Called " + x);
//		System.out.println("Default Constructor Called " + flag);
//		System.out.println("Default Constructor Called " + marks);
//	}

//	DefaultConstructorDemo(char a) {
//		ch = a;
//		System.out.println("Paramater Constructor Called " + a);
//	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DefaultConstructorDemo constructorDemo = new DefaultConstructorDemo();
		DefaultConstructorDemo constructorDemo2=new DefaultConstructorDemo(1,true,'C'); 
//		DefaultConstructorDemo obj1 = new DefaultConstructorDemo();
//		DefaultConstructorDemo obj2 = new DefaultConstructorDemo(10);
//		System.out.println("OBject 1 Value of X " + obj1.x);
//		System.out.println("OBject 2 Value of X " + obj2.x);
////		System.out.println("HashCode: " + obj1.hashCode());
//		System.gc();
//		System.out.println("OBject 1 Value of X " + obj1.x);

		System.out.println("Default X Called " + constructorDemo2.x);
		System.out.println("Default flag Called " + constructorDemo2.flag);
		System.out.println("Default marks Called " + constructorDemo2.marks);
		System.out.println("Default ch Called " + constructorDemo2.ch);
	}



/**
 * @param x
 * @param flag
 * @param ch
 */
public DefaultConstructorDemo(int x, boolean flag, char ch) {
	super();
	this.x = x;
	this.flag = flag;
	this.ch = ch;
}

	/**
	 * 
	 */
//	public DefaultConstructorDemo() {
//		super();
//
//		System.out.println("Default Constructor Init complete");
//	}
//
//	/**
//	 * @param x
//	 */
//	public DefaultConstructorDemo(int x) {
//		super();
//		this.x = x;
//	}

}
