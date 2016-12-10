package com.niit.loginapp.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.corba.se.pept.transport.Connection;

public class DBConnection {
	private static String userName="sa";
	private static String password="";
	private static String url="jdbc:h2:tcp://localhost/~/test";
	private static String driver="org.h2.Driver";
	
	
	private static java.sql.Connection connection=null;
	private DBConnection()
	{
			

}
public static java.sql.Connection getDBConnection() throws ClassNotFoundException,SQLException{
Class.forName(driver);
connection = DriverManager.getConnection(url,userName,password);
	return connection;
}
public static void main(String[] args)
{
	try {
		if(getDBConnection()==null)
		{
			System.out.println("could not established the connection");
			
		}
		else
		{
			System.out.println("Connection successfuly established");
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
