/**
 * 
 */
package com.org.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author vijaykumbhar
 *
 */
public class InputStreamExample {

	public static String readFile(File file) throws IOException {
		StringBuilder sb = new StringBuilder();
//		InputStream in = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String line;
		while ((line = br.readLine()) != null) {
			sb.append(line + System.lineSeparator());
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		File file = new File("D:\\Study\\Source_Codes\\Core_JAVA_Workspace\\FileOperations\\LogRead.txt");
		String content = null;
		try {
			content = readFile(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(content);
	}
}
