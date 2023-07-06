package com.org.construtor.demo;

import java.sql.Date;

public class Student {

	public int rollNo;
	public String fullName;
	public Date dob;

	public Student() {
		super();
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @param rollNo
	 * @param fullName
	 * @param dob
	 */
	public Student(int rollNo, String fullName, Date dob) {
		super();
		this.rollNo = rollNo;
		this.fullName = fullName;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", fullName=" + fullName + ", dob=" + dob + "]";
	}

	public static void main(String[] args) {
// Default Constructor
		Student student = new Student();
		Student student1 = new Student(1, "ACB", null);
		System.out.println("Default Constructor:: " + student.toString());
		System.out.println("Param Constructor:: " + student1.toString());

	}
}
