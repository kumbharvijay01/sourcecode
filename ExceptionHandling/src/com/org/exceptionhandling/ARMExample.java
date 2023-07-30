/**
 * 
 */
package com.org.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 */
public class ARMExample {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		String url = "jdbc:mysql://localhost:3306/corejava";
		String userName = "root";
		String password = "Welcome@129#2022";
		try (Connection connection = DriverManager.getConnection(url, userName, password);
				Statement statement = connection.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection Object " + connection);
			ResultSet resultSet = statement.executeQuery("select * from employee");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
				System.out.println(resultSet.getString(5));
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("d");
		}
	}

}
