/**
 * 
 */
package com.org.bhfl.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author vijaykumbhar
 *
 */
public class ConnectionDBDemo {

	public static void main(String args[])

	{
		String url = "jdbc:mysql://localhost:3306/testdb2";
//		JDBC:DB providerName: 
//MYSQL: 3306
//Postgres : 5432
//Oracle: 1521
//SQL Server : 1433
		String userName = "root";
		String password = "Welcome@129#2022";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");

			try {
				Connection connection = DriverManager.getConnection(url, userName, password);
				System.out.println("Connection Established" + connection);

				Statement statement = connection.createStatement();
//				int x = statement.executeUpdate("INSERT INTO myplayers (ID) VALUES (9)");
//				System.out.println("Rows affected using JDBC :" + x);

//				String query="UPDATE myplayers SET First_Name="+"'Soumya'"+" ,Last_Name="+"'Vipra' where id=9";
//				System.out.println(query);

//				int x = statement.executeUpdate(query);
//				System.out.println("Rows affected using JDBC :" + x);

				String query = "delete from myplayers where id=1000";
				int x = statement.executeUpdate(query);
				System.out.println("Rows Deleted using JDBC :" + x);

//				ResultSet rs = statement.executeQuery("SELECT * FROM myplayers");

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("Driver Loaded Successfully with TRY");
//			Connection connection = DriverManager.getConnection(url, userName, password);
//			System.out.println("Connection Established with TRY" + connection);
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}

	}
}
