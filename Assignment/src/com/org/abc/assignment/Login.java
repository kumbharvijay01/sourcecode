/**
 * 
 */
package com.org.abc.assignment;

import java.util.Scanner;

/**
 * 
 */
public class Login {

	private String username;
	private String password;

	public String doLogin(String username, String password) {
		if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			return username;
		} else {
			return "Invalid";
		}

	}

	public boolean getRoles(String username) {
		if (username.equalsIgnoreCase("admin")) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter User Name ");
		String userName = scanner.nextLine();

		System.out.println("Enter Password ");
		String password = scanner.nextLine();

		Login login = new Login();
		String output = login.doLogin(userName, password);
		System.out.println("Output Received from login method " + output);

		System.out.println(" Get Roles Output " + login.getRoles(output));

	}

}
