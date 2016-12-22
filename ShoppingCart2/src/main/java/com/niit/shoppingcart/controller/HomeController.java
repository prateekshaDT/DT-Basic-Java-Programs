
package com.niit.shoppingcart.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String homepage()
	{
		
		//Want to navigate to home page
		
		System.out.println("Executing the method homepage");
		return "home";
		
	}
	@RequestMapping("/login")
	public ModelAndView showLoginpage()
	{
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("msg","you clicked login link");
		mv.addObject("showLoginpage","true");
		
		return mv;
	
	}
	
    
	@RequestMapping("/registration")
	public ModelAndView showRegistrationpage()
	{
		ModelAndView mv=new ModelAndView("home");
	mv.addObject("msg","you clicked registration link");
	mv.addObject("showRegistrationpage","true");
	
	return mv;
		
	}

}
