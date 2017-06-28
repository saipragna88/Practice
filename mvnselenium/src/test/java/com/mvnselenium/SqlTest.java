package com.mvnselenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlTest {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con=DriverManager.getConnection(
					"jdbc:sqlserver://KATHALA\\SQLEXPRESS;databaseName=AdventureWorks2014;integratedSecurity=true");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
