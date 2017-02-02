package com.niit.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.DAO.CategoryDAO;
import com.niit.DAO.ProductDAO;
import com.niit.model.Product;

@Controller
public class HomeController {
	
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired(required = true)
	private ProductDAO productDAO;

	@RequestMapping("/")
	public ModelAndView getPage( @ModelAttribute("selectedProduct") final Product selectedProduct) {
	
		ModelAndView model=new ModelAndView("/index");
		
		model.addObject("categoryList", categoryDAO.list());
		model.addObject("productList", productDAO.list());
		
		
		System.out.println("inside controller ");

		if(selectedProduct!=null){
			model.addObject("selectedProduct",selectedProduct);
		}
		else
			System.out.println("The object is null");
		
		return model;
		
	}
	
	
	/*@RequestMapping("/")
	public String getindexpage()
	{
	System.out.println("inside controller");
	return "index";
	}*/
	
	
	@RequestMapping("/index")
	public ModelAndView getPage1( @ModelAttribute("selectedProduct") final Product selectedProduct) {
		
		ModelAndView model=new ModelAndView("index");
		
		model.addObject("categoryList", categoryDAO.list());
		model.addObject("productList", productDAO.list());
		
		
		System.out.println("inside controller");

		if(selectedProduct!=null){
			model.addObject("selectedProduct",selectedProduct);
		}
		else
			System.out.println("The object is null");
		
		return model;
		
	}
	
	
	/*@RequestMapping("/index")
	public String getindexpage1()
	{
	System.out.println("inside controller");
	return "index";
	}*/
	@RequestMapping("/checkout")
	public String getcheckoutpage()
	{
		System.out.println("inside controller");
		return "checkout";
	}
	@RequestMapping("/contact")
	public String getcontactpage()
	{
		System.out.println("inside controller");
		return "contact";
	}
	
	

	@RequestMapping("/pressroom")
	public String getpressroompage()
	{
		System.out.println("inside controller");
		return "pressroom";
	}
	@RequestMapping("/product")
	public String getproductpage()
	{
		System.out.println("inside controller");
		return "product";
	}
	@RequestMapping("/product-k")
	public String getproductkpage()
	{
		System.out.println("inside controller");
		return "product-k";
	}
	@RequestMapping("/product-m")
	public String getproductmpage()
	{
		System.out.println("inside controller");
		return "product-m";
	}
	@RequestMapping("/shortcodes")
	public String getshortcodespage()
	{
		System.out.println("inside controller");
		return "shortcodes";
	}
	
	
	
	@RequestMapping("/single")
	public String getsinglepage()
	{
		System.out.println("inside controller");
		return "single";
	}
	@RequestMapping("/terms")
	public String gettermspage()
	{
		System.out.println("inside controller");
		return "terms";
	}

}
	