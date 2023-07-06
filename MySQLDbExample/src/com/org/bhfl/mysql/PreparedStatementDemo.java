/**
 * 
 */
package com.org.bhfl.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.DatabaseMetaData;

/**
 * @author vijaykumbhar
 *
 */
public class PreparedStatementDemo {

	public void insertRecord(Connection connection) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Employee Code");
		int empCode = scanner.nextInt();

		System.out.println("Enter First Name");
		String fName = scanner.nextLine();

		System.out.println("Enter Last Name");
		System.out.println("Enter Last Name");
		System.out.println("Enter Last Name");
		System.out.println("Enter Last Name");
		
		String lName = scanner.nextLine();

		System.out.println("Enter Place of Birth");
		String placeofBirth = scanner.nextLine();

		System.out.println("Enter Country");
		String country = scanner.nextLine();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(
					"INSERT INTO EMPLOYEE (id,First_Name,Last_Name,Place_Of_Birth,Country)VALUES(?,?,?,?,?)");
			preparedStatement.setInt(1, empCode);
			preparedStatement.setString(2, fName);
			preparedStatement.setString(3, lName);
			preparedStatement.setString(4, placeofBirth);
			preparedStatement.setString(5, country);
			int x = preparedStatement.executeUpdate();
			System.out.println("Row Inserted Count " + x);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void retriveData(Connection connection, int playerId) {
		try (PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM myplayers where id=?")) {
			pstmt.setInt(1, playerId);
			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				System.out.println("Player ID :" + resultSet.getInt(1));
				System.out.println("Player FirstName " + resultSet.getString(2));
				System.out.println("Player LastName" + resultSet.getString(3));
				System.out.println("Player DOB " + resultSet.getString(4));
				System.out.println("Player Place of Birth: " + resultSet.getString(5));
				System.out.println("Player Country of birth : " + resultSet.getString(6));
				System.out.println("--------------------------------------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				System.out.println("Connection Closed ");
			} catch (SQLException e) {
				System.out.println("Exception Occured while Closing the Connection");
				e.printStackTrace();
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MySqlConnection mySqlConnection = new MySqlConnection();
		Connection connection = mySqlConnection.getConnection();
		try {
			DatabaseMetaData databaseMetaData = (DatabaseMetaData) connection.getMetaData();
			System.out.println("Major Version :" + databaseMetaData.getDatabaseMajorVersion());
			System.out.println("Minor Version :" + databaseMetaData.getDatabaseMinorVersion());

			System.out.println("Minor Version :" + databaseMetaData.getDriverMajorVersion());
//			System.out.println("Minor Version :" + databaseMetaData.getDriverName());
			System.out.println("Minor Version :" + databaseMetaData.getMaxColumnsInTable());
			System.out.println(
					"databaseMetaData.supportsStoredProcedures() :" + databaseMetaData.supportsStoredProcedures());
			System.out.println("databaseMetaData.getSQLKeywords() :" + databaseMetaData.getSQLKeywords());

			PreparedStatement pstmt = connection.prepareStatement("select * from myplayers");

			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.println("Column Index : " + i + "  Column Name: " + rsmd.getColumnLabel(i) + "  Datatype"
						+ rsmd.getColumnClassName(i));
				System.out.println(rsmd.getPrecision(i));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

//		PreparedStatementDemo preparedStatementDemo = new PreparedStatementDemo();
////		preparedStatementDemo.insertRecord(connection);
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter the Player ID to Search : ");
//		int playerId = scanner.nextInt();
//		preparedStatementDemo.retriveData(connection, playerId);
//
////		preparedStatement
//
////		INSERT INTO employee (ID,First_Name,Last_Name,Date_Of_Birth,Place_Of_Birth,Country) VALUES(

	}

}
