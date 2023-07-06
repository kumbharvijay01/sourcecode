/**
 * 
 */
package com.org.radical;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 */
public class StatementDemo {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MySqlConnection mySqlConnection = new MySqlConnection();
		Connection connection = mySqlConnection.getConnction();
//		Statement
//		PreparedStatement
//		CallableStatement
		try {
			Statement statement = connection.createStatement();
			int rowupdate = statement
					.executeUpdate("INSERT INTO EMPLOYEE (name,location,salary) values ('Nilesh','Delhi',50000)");
			System.out.println(rowupdate + " inserted ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
