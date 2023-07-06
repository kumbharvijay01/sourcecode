package com.org.flowdemo;

public class CollegeStudents {

	public static void main(String[] args) {
		Student student = new Student();
		student.setPid(10000);
		student.setPname("YYYYYY");
		student.setStudAge(15);

		student.setStudentClass("IV");
		student.display();

		String xyz = "dbk";
		String abc = xyz;
		System.out.println(xyz.charAt(2));
		System.out.println(xyz.equals(abc));
		System.out.println(xyz.concat("ABC"));
		System.out.println(xyz);
	}

}
