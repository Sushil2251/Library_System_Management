package com.configuration;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	static final String URL="jdbc:mysql://localhost:3306/library_database";
	static final String USER="root";
	static final String PASS="root";
	
	public  static Connection getConnection() throws SQLException
	{
		
		Connection connection=null;
		connection=DriverManager.getConnection(URL,USER,PASS);
		return connection;
	}
	public static void main(String[] args) throws SQLException
	{
		Connection connection=ConnectionFactory.getConnection();
		if(connection!=null)
		{
			System.out.println("Successfully Connected");
		}
		else
			System.out.println("Unsuccessful");
		// TODO Auto-generated method stub

	}


}