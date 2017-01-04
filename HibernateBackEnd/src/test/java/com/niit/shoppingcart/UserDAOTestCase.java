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
		user = userDAO.get("a7");
		
		//Assert statements
		
		Assert.assertEquals("User Test Case" , "ammu" , user.getName());
	}
	
	@Test
	public void validateCredentials()
	{
		user = userDAO.validate("a7","niit");
		Assert.assertNotNull("Validate Credentials",user);
		
	}
	
	@Test
	public void InvalidateCredentials()
	{
		user = userDAO.validate("a7","harii");
		Assert.assertNotNull("Invalidate Credentials",user);
		
	}
	
	public void getAllUsersTestCase()
	{
	  int size=	userDAO.list().size();
	  Assert.assertEquals("length check",8,size);
	}
	
	@Test
	public void saveTestCase()
	{
		user.setId("prathi");
		user.setName("prathi");
		user.setPassword("prathi");
		user.setMail("prathi@gmail");
		user.setContact("9743356601");
		user.setRole("customer");
		Assert.assertEquals("saveTestCase",true, userDAO.save(user));
	}

	@Test
	public void updateTestCase()
	{
		user = userDAO.get("a7");
		user.setName("nanda");
		user.setContact("7777777777");
		
		user.setMail("nanda@yahoo.com");
		Assert.assertEquals("updateTestCase",true, userDAO.update(user));
	}

}
