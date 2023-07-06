package com.org.test;

public class StringOperations {

	public static void main(String[] args) {
		String fname = "ABC";
		String lname = "PQR";
		String mname = new String("ABC");
		String test = "ABC";
		String Dname = new String("ABC");

		System.out.println(fname.concat(lname));
		fname = fname + lname;
		System.out.println(fname);
		if (Dname.equals(mname)) {
			System.out.println("Match");
		}
	}

}
