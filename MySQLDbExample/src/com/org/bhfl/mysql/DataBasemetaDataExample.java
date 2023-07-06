/**
 * 
 */
package com.org.bhfl.mysql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

/**
 * 
 */
public class DataBasemetaDataExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MySqlConnection mySqlConnection = new MySqlConnection();
		Connection connection = mySqlConnection.getConnection();
		try {
			DatabaseMetaData databaseMetaData = connection.getMetaData();
			System.out.println(databaseMetaData.getDriverVersion());
			System.out.println(databaseMetaData.getURL());
			System.out.println(databaseMetaData.getDatabaseMajorVersion());
			System.out.println(databaseMetaData.getDatabaseMinorVersion());
			System.out.println(databaseMetaData.getDriverVersion());
			System.out.println(databaseMetaData.getSQLKeywords());
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
