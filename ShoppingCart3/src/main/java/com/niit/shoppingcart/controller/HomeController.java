
package com.niit.shoppingcart.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.temp.UserDAO;

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
	@RequestMapping("/validate")
	public ModelAndView validate(@RequestParam("id") String id,@RequestParam("password") String pwd, Object password)
	{
		System.out.println("In validate method");
		System.out.println("id" +id);
		System.out.println("pwd" +pwd);
		ModelAndView mv=new  ModelAndView("home");
		
		UserDAO userDAO=new UserDAO();
		if(userDAO.isValidCredentials(id,pwd) == true)
		{
			mv.addObject("succesMsg", "you logged in succesfully");
		}
		else
		{
			mv.addObject("errorMsg", "invalidredentials..please try again");
		}
		return mv;
	}

}