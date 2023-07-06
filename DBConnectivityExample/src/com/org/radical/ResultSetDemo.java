/**
 * 
 */
package com.org.radical;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 
 */
public class ResultSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MySqlConnection mySqlConnection = new MySqlConnection();
		Connection connection = mySqlConnection.getConnction();

		try {
//			Statement statement = connection.createStatement();
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from employee where location = ?");
			preparedStatement.setString(1, "Pune");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println("ID " + resultSet.getString(1));
				System.out.println("Name " + resultSet.getString("name"));
				System.out.println("Location " + resultSet.getString("location"));
				System.out.println("Cration Date " + resultSet.getString(4));
				System.out.println("Salary" + resultSet.getString(5));

				System.out.println("---------------------------------");

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
