/**
 * 
 */
package com.org.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */
public class FileHandling {

	public void readContent() {
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
		} finally {
			file.delete();
		}

	}

	public void readContent1() {
		
		
		

	}

	public static void main(String ag[]) throws Exception {
		System.out.println("Hello");
	}
}
