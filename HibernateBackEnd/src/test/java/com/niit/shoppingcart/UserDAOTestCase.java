package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

import junit.framework.Assert;

public class UserDAOTestCase {
	
	//Autowired - DAO,DO,context
	
	@Autowired
	static UserDAO userDAO;
	
	@Autowired
	static User user;
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	
	//previously we written constructor
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		user = (User) context.getBean("user");
		
		userDAO = (UserDAO) context.getBean("userDAOImpl");
	}
	
	@Test
	public void getUserTestCase()
	{
		user = userDAO.get("niit");
		
		//Assert statements
		
		Assert.assertEquals("User Test Case" , "niit" , user.getName());
	}
	
	@Test
	public void validateCredentials()
	{
		user = userDAO.validate("niit","niit");
		Assert.assertEquals("In valid Test Case",null,user);
		
	}
	
	public void getAllUsersTestCase()
	{
	  int size=	userDAO.list().size();
	  Assert.assertEquals("length check",8,size);
	}

	
}
