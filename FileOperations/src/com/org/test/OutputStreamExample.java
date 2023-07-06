/**
 * 
 */
package com.org.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author vijaykumbhar
 *
 */
public class OutputStreamExample {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file Name to Write Content. It will accept the text format");
		String fileName = sc.nextLine();
		String pathName = "D:\\Study\\Source_Codes\\Core_JAVA_Workspace\\FileOperations\\" + fileName;
		OutputStreamExample outputStreamExample = new OutputStreamExample();
		outputStreamExample.writeContent(pathName);
		outputStreamExample.writePrintWriter();

		outputStreamExample.writeContentString(pathName);

	}

	public void writePrintWriter() throws IOException {
		FileWriter fileWriter = new FileWriter(
				"D:\\Study\\Source_Codes\\Core_JAVA_Workspace\\FileOperations\\WriterDemo.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.write("Welcome To Java World");
		printWriter.flush();
		printWriter.close();

	}

	public void writeContentString(String pathName) {

		try {
			OutputStream output = new FileOutputStream(pathName);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void writeContent(String pathName) {
		try {
			OutputStream output = new FileOutputStream(pathName);
			byte b[] = { 65, 66, 67, 68, 69, 70 };
			String x;

			// illustrating write(byte[] b) method
			output.write(b);

			// illustrating flush() method
			output.flush();

			// illustrating write(int b) method
			for (int i = 71; i < 75; i++) {
				output.write(i);
				output.write(i);
			}

			output.flush();

			// close the stream
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}
