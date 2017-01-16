package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	/*
	 * This controller is to load login page and show login related errors
	 */


	@RequestMapping("/loginPage")
	public String loadLoginPage() {
		return "login";
	}

	
	/*SELECT *
	FROM database.sys.all_objects
	WHERE upper(name) like upper('my prefix%') */
	

	@RequestMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {
		

		System.out.println("Inside login mapping");
		System.out.println(logout+"    "+error);
		
		if (error != null) {
			model.addAttribute("error", "Invalid username and password");
			return "login";// return to login page
		}
		
		//After successfull logout
		return "redirect:/";
	
	}

}
