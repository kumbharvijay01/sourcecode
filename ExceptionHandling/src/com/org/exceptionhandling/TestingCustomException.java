/**
 * 
 */
package com.org.exceptionhandling;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

/**
 * @author vijaykumbhar
 *
 */
public class TestingCustomException {

	/**
	 * @param args
	 * @throws InvalidDLAgeException
	 */
	public void validateAge(int age) throws InvalidDLAgeException {
		if ((age < 18) || (age > 65)) {
			System.out.println("Inside IF");
			throw new InvalidDLAgeException("You are not eligible for Driving Licence.");
		} else {
			System.out.println("Inside Else ");
			System.out.println("You are Eligible for DL");
		}
	}

	public void checkNegative(int number) throws NegativeNumberException {
		if (number <= 0) {
			throw new NegativeNumberException("Number Cann't be Less than Zero");
		} else {
			System.out.println("Execution completed");
		}

	}

	public static void main(String[] args) throws InvalidDLAgeException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check Driving Licence ");
		int age = scanner.nextInt();
//		BufferedReader bufferedReader=new BufferedReader();
		TestingCustomException customException = new TestingCustomException();
		customException.validateAge(age);
		System.out.println("Enter number to check negative Exception");
		int number = scanner.nextInt();
		try {
			customException.checkNegative(number);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
	}
}
