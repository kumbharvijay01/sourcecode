/**
 * 
 */
package com.org.bhfl.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 * 
 */
public class ResultSetMetaDataExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		MySqlConnection mySqlConnection = new MySqlConnection();
		Connection connection = mySqlConnection.getConnection();

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from employee");
		
		ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
		System.out.println(resultSetMetaData.getColumnCount());
		
		for(int i=1;i<=resultSetMetaData.getColumnCount();i++)
		{
			System.out.print("\t"+resultSetMetaData.getColumnName(i));
			System.out.print("\t"+resultSetMetaData.getColumnDisplaySize(i));
			System.out.print("\t"+resultSetMetaData.getColumnTypeName(i));
			System.out.println();
			
		}

//		while (resultSet.next()) {
//			System.out.println("Emp ID " + resultSet.getInt(1));
//		}

	}

}
