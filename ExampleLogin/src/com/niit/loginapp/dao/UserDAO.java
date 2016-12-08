package com.niit.loginapp.dao;

public class UserDAO {
	// what Should be the method signature for validate user
	
	//isValidUser
	//isValidCredentials
	//ValidCredentials
	
	public boolean isValidUser(String UserID,String password)
	{
	if(UserID.equals("niit") && password.equals("niit"))	
	{
		return true;
	}
	else
	{
		return false;
	}
	}

}
