/**
 * 
 */
package com.org.bhfl.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author vijaykumbhar
 *
 */
public class MySqlConnection {

	public Connection getConnection() {
		DBProperties dbProperties = new DBProperties();
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			try {
				connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getUserName(),
						dbProperties.getPassword());
				System.out.println("DB Connection Established" + connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;

	}

}
