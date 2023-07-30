package com.org.test;

public class StringOperations {

	public static void main(String[] args) {
		String fname = " ABC ";
		String lname = "PQR";
		String mname = new String("ABC");
		String test = "ABC";
		String Dname = new String("ABC");

		char d = fname.charAt(0);
		System.out.println(fname.compareTo(Dname));

		System.out.println(fname.trim());
		System.out.println(fname);
		System.out.println(fname.contains(test));
		String path = "This is Pratap: 66";
		String arg[] = path.split(" ");

//		System.out.println(arg[1]);
//		path = path.replace(" ", ",");
//		System.out.println(path);

//		System.out.println(fname.concat(lname));
//		fname = fname + lname;
//		System.out.println(fname);
//		if (Dname.equals(mname)) {
//			System.out.println("Match");
//		}
//		System.out.println(fname.equals(Dname));

		System.out.println(arg[3]);
		
	}

}
