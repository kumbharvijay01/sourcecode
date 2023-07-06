package com.org.test.example;

public class ThreadClassDemo {

	public static void main(String[] args) throws Exception {
		ChildClass childClass = new ChildClass();
		childClass.start();

//		childClass.destroy();
		System.out.print(childClass.getId());

	}

}
