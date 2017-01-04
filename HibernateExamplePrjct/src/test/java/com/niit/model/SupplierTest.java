package com.niit.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.SupplierDAO;

public class SupplierTest {
	
	 public static void main(String[] args) {
			
		   AnnotationConfigApplicationContext con = new  AnnotationConfigApplicationContext ();
		   con.scan("com.niit.*");
		   con.refresh();
		   Supplier supplier=(Supplier)con.getBean("supplier");
		   SupplierDAO supplierdao=(SupplierDAO)con.getBean("supplierDAOImpl");
		   
		   supplier.setSupplier_id(01);
		   supplier.setSupplier_name("abc");
		   supplier.setSupplier_desc("mn");
		  supplierdao.save(supplier);
		   supplierdao.update(supplier);
		   supplierdao.list();

	   }

}
