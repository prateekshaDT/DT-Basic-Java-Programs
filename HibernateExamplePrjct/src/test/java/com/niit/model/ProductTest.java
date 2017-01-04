package com.niit.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.ProductDAO;

public class ProductTest {
	
	 public static void main(String[] args) {
			
		   AnnotationConfigApplicationContext con = new  AnnotationConfigApplicationContext ();
		   con.scan("com.niit.*");
		   con.refresh();
		   Product product=(Product)con.getBean("product");
		   ProductDAO productdao=(ProductDAO)con.getBean("productDAOImpl");
		   
		   product.setProduct_id(21);
		   product.setProduct_name("poorna");
		   product.setProduct_desc("dgk");
		   productdao.save(product);
		   productdao.update(product);
		   productdao.list();

	   }

}
