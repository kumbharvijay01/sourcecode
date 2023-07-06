package com.org.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String args[]) throws Exception {
		// Getting the connection
		String dbURL = "jdbc:mysql://localhost:3306/testdb2";
		try (Connection con = DriverManager.getConnection(dbURL, "root", "Welcome@129#2022");
				Statement stmt = con.createStatement();) {
		Connection con = DriverManager.getConnection(mysqlUrl, "root", "Welcome@129#2022");
		System.out.println("Connection established......");

		// Creating the DatabaseMetaData object
		DatabaseMetaData dbMetadata = con.getMetaData();
		// invoke the supportsBatchUpdates() method.
		boolean bool = dbMetadata.supportsBatchUpdates();

		if (bool) {
			System.out.println("Underlying database supports batch updates");
		} else {
			System.out.println("Underlying database doesnt supports batch updates");
		}

		// Retrieving the driver name
		System.out.println(dbMetadata.getDriverName());
		// Retrieving the driver version
		System.out.println(dbMetadata.getDriverVersion());
		// Retrieving the user name
		System.out.println(dbMetadata.getUserName());
		// Retrieving the URL
		System.out.println(dbMetadata.getURL());
		// Retrieving the list of numeric functions
		System.out.println("Numeric functions: " + dbMetadata.getNumericFunctions());
		System.out.println("");
		// Retrieving the list of String functions
		System.out.println("String functions: " + dbMetadata.getStringFunctions());
		System.out.println("");
		// Retrieving the list of system functions
		System.out.println("System functions: " + dbMetadata.getSystemFunctions());
		System.out.println("");
		// Retrieving the list of time and date functions
		System.out.println("Time and Date funtions: " + dbMetadata.getTimeDateFunctions());
	}
}
