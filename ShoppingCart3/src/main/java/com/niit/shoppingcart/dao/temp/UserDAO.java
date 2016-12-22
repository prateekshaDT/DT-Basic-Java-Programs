package com.niit.shoppingcart.dao.temp;

public class UserDAO {
	public boolean isValidCredentials(String id,String password)
	{
		if(id.equals("niit") && password.equals("niit@123"))
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}

}
