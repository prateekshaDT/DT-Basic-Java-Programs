/*package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.UsersDao;
import com.niit.model.Users;



public class Test {
	
	public static void main(String[] args){
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		Users user=(Users)context.getBean("users");
		
		UsersDao userdao=(UsersDao)context.getBean("usersDao");
		
		user.setMobile("jckdsjkl");
 		
		userdao.registerUser(user);
	}


}
*/