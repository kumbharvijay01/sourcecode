package com.org.flowdemo;

public class Student extends Person {

	private String studentClass;
	private int studAge;
	private String gender;

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}

	public Student() {
		super();
		System.out.println("Student Class Called");
		this.studentClass = studentClass;
		this.studAge = studAge;
	}

	public void display() {
		super.display();
		this.gender = "m";
		super.gender = "F";
		System.out.println("Super CLass Person Gender Value." + super.getGender());
		System.out.println("Sub CLass Student Gender Value." + gender);
	}

	public Student(String studentClass, int studAge) {
		super();
		this.studentClass = studentClass;
		this.studAge = studAge;
	}

}
