package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String getindexpage()
	{
	System.out.println("inside controller");
	return "index";
	}
	@RequestMapping("/index")
	public String getindexpage1()
	{
	System.out.println("inside controller");
	return "index";
	}
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
	@RequestMapping("/login")
	public String getloginpage()
	{
		System.out.println("inside controller");
		return "login";
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
	