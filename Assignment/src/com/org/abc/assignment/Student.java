/**
 * 
 */
package com.org.abc.assignment;

import java.util.Scanner;

/**
 * @author vijaykumbhar
 *
 */
public class Student {

	private int rollNo;
	private String name;
	private int subject1, subject2, subject3, subject4;

	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}

	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the subject1
	 */
	public int getSubject1() {
		return subject1;
	}

	/**
	 * @param subject1 the subject1 to set
	 */
	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}

	/**
	 * @return the subject2
	 */
	public int getSubject2() {
		return subject2;
	}

	/**
	 * @param subject2 the subject2 to set
	 */
	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}

	/**
	 * @return the subject3
	 */
	public int getSubject3() {
		return subject3;
	}

	/**
	 * @param subject3 the subject3 to set
	 */
	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}

	/**
	 * @return the subject4
	 */
	public int getSubject4() {
		return subject4;
	}

	/**
	 * @param subject4 the subject4 to set
	 */
	public void setSubject4(int subject4) {
		this.subject4 = subject4;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", subject1=" + subject1 + ", subject2=" + subject2
				+ ", subject3=" + subject3 + ", subject4=" + subject4 + "]";
	}

//
//	/**
//	 * 
//	 */
//	public Student() {
//		super();
//	}
//
//	/**
//	 * @param rollNo
//	 * @param classRoom
//	 * @param name
//	 * @param grade
//	 * @param division
//	 */
//	public Student(int rollNo, String classRoom, String name, String grade, String division) {
//		super();
//		this.rollNo = rollNo;
//		this.classRoom = classRoom;
//		this.name = name;
//		this.grade = grade;
//		this.division = division;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [rollNo=" + rollNo + ", classRoom=" + classRoom + ", name=" + name + ", grade=" + grade
//				+ ", division=" + division + "]";
//	}
//
//	/**
//	 * @param args
//	 */
//	public void acceptStudentInfo(Student student) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the Roll No");
//		student.rollNo = scanner.nextInt();
//
//	}
//
//	public void printStudentInfo(Student student) {
//		System.out.println("Roll No is " + student.rollNo);
//	}
//
//	public static void main(String[] args) {
////		Student student = new Student(10, "8th", "ABC", "A+", "A");
//		Student student2 = new Student();
////		System.out.println(student.toString());
//		student2.acceptStudentInfo(student2);
//		student2.printStudentInfo(student2);
//		System.out.println(student2.toString());
//
////		
//
//	}
//

}
