/**
 * 
 */
package com.org.test.utility;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * @author vijaykumbhar
 *
 */

public class FileHandler {

	public boolean writeFile(String filePath, String content) {
		try (FileWriter fileWriter = new FileWriter(filePath)) {
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.write(content);
			printWriter.flush();
			printWriter.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return true;
	}

	public void readFileContent(String pathName) {

	}

}
