/**
 * 
 */
package com.org.mysqldbconnect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author vijaykumbhar
 *
 */

public class Demo {

	public static void main(String args[]) {

		try {
//			1 Load The Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
//			2 Establish the connection with Mysql

//			DB URL, UserName, Password
			String url = "jdbc:mysql://localhost:3306/corejava";
			String userName = "root";
			String password = "Welcome@129#2022";
			try (Connection connection = DriverManager.getConnection(url, userName, password);) {
				System.out.println("Connection Object " + connection);

//				Statement statement = connection.createStatement();
//				for (int j = 0; j < 10; j++) {
//					int i = statement
//							.executeUpdate("insert into employee(name,location,salary) values('ABC','Pune',100)");
//					System.out.println("Rows Inserted in Employee table " + i);
//				}
				connection.setAutoCommit(false);
				CallableStatement callableStatement = connection.prepareCall("{call corejava.prc_emploee()}");
				callableStatement.execute();
				connection.setAutoCommit(true);

//				Statement stmt = connection.createStatement();
//				ResultSet resultSet = stmt.executeQuery("select * from employee");
//				while (resultSet.next()) {
//					System.out.println("ID" + resultSet.getInt(1));
//					System.out.println("Name " + resultSet.getString(2));
//
//				}
//				while (resultSet.next()) {
//					System.out.println("ID" + resultSet.getInt("id"));
//					System.out.println("Name " + resultSet.getString("name"));
//				}
//				PreparedStatement preparedStatement = connection
//						.prepareStatement("insert into employee(name,location,salary) values(?,?,?)");
//				preparedStatement.setString(1, "XYZ");
//				preparedStatement.setString(2, "Nashik");
//				preparedStatement.setInt(3, 1000);
//				int output = preparedStatement.executeUpdate();
//				System.out.println("Rows inserted with Prepared Statement " + output);

			} catch (SQLException e) {

				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
