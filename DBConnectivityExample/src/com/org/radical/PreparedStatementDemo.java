/**
 * 
 */
package com.org.radical;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

/**
 * 
 */
public class PreparedStatementDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MySqlConnection mySqlConnection = new MySqlConnection();
		Connection connection = mySqlConnection.getConnction();

		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("INSERT INTO EMPLOYEE (NAME,LOCATION,SALARY,creationdatetime) VALUES (?,?,?,?)");
			preparedStatement.setString(1, "Naresh");
			preparedStatement.setString(2, "Bangalore");
			preparedStatement.setInt(3, 500000);
			@SuppressWarnings("deprecation")
			Date date = new Date(1923, 6, 19);
			preparedStatement.setDate(4, date);
			int row = preparedStatement.executeUpdate();
			System.out.println(row + " inserted ");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
