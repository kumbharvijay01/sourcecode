/**
 * 
 */
package com.org.abc.assignment;

import java.util.Scanner;

/**
 * 
 */
public class ArrayDemo {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

//		int marks[] = new int[6];
//		System.out.println(marks.length);
//		Scanner scanner = new Scanner(System.in);
//		int subject = 1;
//		for (int i = 0; i < marks.length; i++) {
//			System.out.println("Enter Marks for " + subject);
//			marks[i] = scanner.nextInt();
//			subject++;
////			System.out.println("Marks entered by the user :: " + marks[i]);
//		}

//		int i=0;
//		while(i<marks.length)
//		{
//			i++;
//		}
//		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of student data to perform the assignment.");

		Student studentArray[] = new Student[scanner.nextInt()];

		Student student;
		for (int i = 0; i < studentArray.length; i++) {
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
			studentArray[i] = student;

		}

		System.out.println(studentArray.toString());
		for (Student student2 : studentArray) {
		System.out.println(student2.getSubject1());
		}

	}

}
