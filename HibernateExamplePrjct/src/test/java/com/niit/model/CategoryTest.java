package com.niit.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.CategoryDAO;

public class CategoryTest {
	
   public static void main(String[] args) {
	
	   AnnotationConfigApplicationContext con = new  AnnotationConfigApplicationContext ();
	   con.scan("com.niit.*");
	   con.refresh();
	   Category category=(Category)con.getBean("category");
	   CategoryDAO categorydao=(CategoryDAO)con.getBean("categoryDAOImpl");
	   
	   category.setCategory_id(7);
	   category.setCategory_name("abc");
	   category.setCategory_desc("mn");
	  categorydao.save(category);
	   categorydao.update(category);
	   categorydao.list();

   }
}
