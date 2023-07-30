/**
 * 
 */
package com.org.abc.assignment;

import java.util.Scanner;

/**
 * 
 */
public class ArrayDemo {

	public int list;
	Student studentArray[];

	public void acceptMarks() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of student data to perform the assignment.");
		list = scanner.nextInt();

		studentArray = new Student[list];
		Student student;
		for (int i = 0; i < list; i++) {
			student = new Student();

			System.out.println("Enter the Roll Number ");
			student.setRollNo(scanner.nextInt());

			System.out.println("Enter the Name");
			student.setName(scanner.next());

			System.out.println("Enter the Subject 1");
			student.setSubject1(scanner.nextInt());

			System.out.println("Enter the Subject 2");
			student.setSubject2(scanner.nextInt());

			System.out.println("Enter the Subject 3");
			student.setSubject3(scanner.nextInt());

			System.out.println("Enter the Subject 4");
			student.setSubject4(scanner.nextInt());
			this.studentArray[i] = student;
		}

	}

	public void calculate() {
		int i = 0;
		System.out.println("Array Len : " + studentArray.length);
		while (i < studentArray.length) {
//			studentArray[i].setTotalMarks(studentArray[i].getSubject1() + studentArray[i].getSubject2()
//					+ studentArray[i].getSubject3() + studentArray[i].getSubject4());
			int totalMarks = studentArray[i].getSubject1() + studentArray[i].getSubject2()
					+ studentArray[i].getSubject3() + studentArray[i].getSubject4();
			studentArray[i].setTotalMarks(totalMarks);
			float percentage = studentArray[i].getTotalMarks() / 4;
			studentArray[i].setPercentage(percentage);
			i++;
		}
	}

//
	public void calGrade() {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getPercentage() >= 75) {
				studentArray[i].setGrade("A+");
				studentArray[i].setPromoted(true);
			} else if ((studentArray[i].getPercentage() >= 60) && (studentArray[i].getPercentage() < 75)) {
				studentArray[i].setGrade("A");
				studentArray[i].setPromoted(false);
			} else if ((studentArray[i].getPercentage() <= 60) && (studentArray[i].getPercentage() > 35)) {
				studentArray[i].setGrade("B");
				studentArray[i].setPromoted(false);
			} else {
				studentArray[i].setGrade("FAIL");
				studentArray[i].setPromoted(false);
			}
		}
	}

//
	public void display() {
		for (Student student : studentArray) {
			System.out.println(student.toString());
		}
	}

	public static void main(String[] args) {
		ArrayDemo arrayDemo = new ArrayDemo();
		arrayDemo.acceptMarks();
		arrayDemo.calculate();
		arrayDemo.calGrade();
		arrayDemo.display();
	}
}
