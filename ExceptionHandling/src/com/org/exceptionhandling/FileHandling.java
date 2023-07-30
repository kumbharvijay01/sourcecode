/**
 * 
 */
package com.org.exceptionhandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 */
public class FileHandling {

	public void readUsingFileReader() {
		try (FileReader fr = new FileReader("D:\\doc.csv")) {
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeUsingFileReader() {
		try (FileWriter fr = new FileWriter("D:\\doc2.pdf")) {
			for (int i = 1; i <= 10; i++) {
				fr.write(String.valueOf(2 * i) + "," + String.valueOf(3 * i) + "," + String.valueOf(4 * i));
				fr.write("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readContentBufferedReader() {
		File file = null;
		try {
			file = new File("D:\\doc.csv");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String st;
			while ((st = br.readLine()) != null) {
				System.out.println(st);
			}
		} catch (NullPointerException | IOException e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public void writeContentBufferedWriter() {
		File file = null;
		try {
			file = new File("D:\\BufferedWriter.csv");
//			BufferedWriter br = new BufferedWriter(new FileWriter(file));
			PrintWriter printWriter = new PrintWriter(file);
			printWriter.write("ABCsd");
//			br.write("ADD");
//			String st;
//			for (int i = 1; i <= 10; i++) {
//				br.write(String.valueOf(2 * i) + "," + String.valueOf(3 * i) + "," + String.valueOf(4 * i));
//				br.write("\n");
//			}
		} catch (NullPointerException | IOException e) {
			e.printStackTrace();
		}

	}

	public void readContent1() {

	}

	public static void main(String ag[]) throws Exception {
		System.out.println("Hello");
		FileHandling handling = new FileHandling();
//		handling.readUsingFileReader();
//		handling.writeUsingFileReader();
		handling.writeContentBufferedWriter();

	}
}
