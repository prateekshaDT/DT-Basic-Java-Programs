
package com.niit.shoppingcart.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String homepage()
	{
		
		//Want to navigate to home page
		
		System.out.println("Executing the method homepage");
		return "home";
		
	}
	

}
