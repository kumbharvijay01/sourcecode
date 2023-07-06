/**
 * 
 */
package com.org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.org.test.utility.FileHandler;

/**
 * @author vijaykumbhar
 *
 */
public class CharDemo {

	public static void readFile(String fileName) {
		FileReader fileReader = null;
		try {
			try {
				fileReader = new FileReader(fileName);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			// Reading sourcefile and
			// writing content to target file
			// character by character.
			int temp;
			try {
				while ((temp = fileReader.read()) != -1)
					System.out.print((char) temp);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} finally {
			// Closing stream as no longer in use
			if (fileReader != null)
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	public static void readFile1(String fileName) {
		try (FileReader fileReader = new FileReader(fileName)) {
			int temp;
			while ((temp = fileReader.read()) != -1)
				System.out.print((char) temp);
		} catch (IOException | NullPointerException ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
//		readFile1("D:\\Study\\Source_Codes\\Core_JAVA_Workspace\\FileOperations\\CharDemo.txt");
//		FileHandler fileHandler = new FileHandler();
//		fileHandler.writeFile("", "");

//		FileReader fileReader = new FileReader("LogRead.txt");
//		int temp;
//		try {
//			while ((temp = fileReader.read()) != -1)
//				System.out.print((char) temp);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("Example.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

		PrintWriter printWriter = new PrintWriter(fileWriter);
		System.out.println("Enter Number of lines to writen inside the file");
		Scanner scanner = new Scanner(System.in);

		int loc = scanner.nextInt();
		for (int i = 0; i <= loc; i++) {
			printWriter.write("Line No :" + i + " Random Value :" + String.valueOf(Math.random()));
			printWriter.write("\n");
		}
		printWriter.flush();
		printWriter.close();
		System.out.println("Writing task completed ");
		System.out.println("Reading the file ");
		FileReader fileReader = null;
		File file = new File("Example.txt");
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int temp;
		try {
			while ((temp = fileReader.read()) != -1)
				System.out.print((char) temp);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Reading File Completed");
	}

}
