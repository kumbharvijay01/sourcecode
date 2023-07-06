package com.org.test.oops;

public class StringDemo {

	public static void main(String args[]) {
//		int []array=new int [5];
		char c = 'd';
//		System.out.println(c);

//		char [] arraych=new char[5];
		char[] arraych = { 'a', 'B', 'C', 'd' };
//		System.out.println(arraych);
		String name = "aBCd";
//		System.out.println(name);
//		System.out.println(name.charAt(0));
//		System.out.println(name.compareTo("aBCD"));
		name = name.concat("XYZ");
//		System.out.println(name.concat("XYZ"));
		System.out.println(name);
		char x = 'a';
//		System.out.println(name.contains(x));
//		boolean xy = name.isBlank();
		System.out.println(name.length());
		System.out.println(name.replace('a', 'h'));
		
//		System.out.println(name.);
		
		

	}
}
