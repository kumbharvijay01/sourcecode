/**
 * 
 */
package com.org.radical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 */
public class MySqlConnection {

	private Connection connection;

	public Connection getConnction() {
		String url = "jdbc:mysql://localhost:3306/corejava";
		String userName = "root";
		String password = "Welcome@129#2022";
		try {
// 1 :Load The Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");
			try {
//				Establish the DB connectivity
				this.connection = DriverManager.getConnection(url, userName, password);
				System.out.println("Connection Object " + connection);
			} catch (SQLException e) {
				System.out.println("Unable to Connect Database Getting Error while Connection :" + e.getMessage());
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Unable to Load Driver Getting Error " + e.getMessage());
			e.printStackTrace();
		}
		return connection;

	}

	public static void main(String args[]) {

	}

}
