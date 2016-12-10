package com.niit.loginapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.niit.loginapp.connection.DBConnection;
import com.niit.loginapp.model.User;


public class UserDAO1 {
	
	//CRUD operation
	//Validations
	private Connection con;
	private PreparedStatement pStatement;
	private ResultSet resultSet;
	
	public boolean isValidUser(String UserID,String password) throws ClassNotFoundException, SQLException
	{
		
			con = DBConnection.getDBConnection();
			String query ="select * from tuser where id=? and password=?";
		try{
			pStatement =  con.prepareStatement(query);
			pStatement.setString(1,UserID);
			pStatement.setString(2,password);
			resultSet = pStatement.executeQuery();
			if(resultSet.next())
			{
				return true;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
				pStatement.close();
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
	}

	
// create, update, delete, retrive

public User getUser(String id) throws ClassNotFoundException, SQLException
{
	con=DBConnection.getDBConnection();
	String query="select * from tuser where id=?";
	User user=null;
	try{
		pStatement=con.prepareStatement(query);
		pStatement.setString(1,id);
	
		resultSet=pStatement.executeQuery();
		if(resultSet.next())
		{
			user = new User();
			user.setId(resultSet.getString(1));
			user.setPassword(resultSet.getString(2));
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	finally
	{
		try{
		con.close();
		pStatement.close();
		resultSet.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		}
	
return user;

}
}
