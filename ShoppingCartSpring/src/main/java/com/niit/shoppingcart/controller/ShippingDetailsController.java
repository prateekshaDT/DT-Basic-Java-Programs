package com.niit.shoppingcart.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.DAO.ShippingDetailDAO;
import com.niit.model.Shipping;
import com.niit.model.UsersDetail;



@Controller

public class ShippingDetailsController {

	@Autowired
	private ShippingDetailDAO shippingDetailDAO;
	

	
	@RequestMapping("/shippingdetails")
	public String registerUser(Model model) {

		Shipping shipping = new Shipping();
		model.addAttribute("shipping", shipping);
		return "shippingdetails";
	}
	
	
	@RequestMapping(value = "/shippingdetails", method = RequestMethod.POST)
	public ModelAndView shippingUserPost(@Valid @ModelAttribute("shipping") Shipping shipping,
			BindingResult result) {
		
		/*if (result.hasErrors()) {					
			ModelAndView model=new ModelAndView("register");
			model.addObject("message", "You have entered invalid details");
			
			System.out.println("Page has errors");
			return model;
		}
		
		List<Shipping> shippingList = shippingDetailDAO.getAllShipping();
	System.out.println(shipping.getUsername());
		{
			
		}

        for (int i=0; i< shippingList.size(); i++) {
        	ModelAndView model=new ModelAndView("shippingdetails");
        	if(shipping.getAddress().equals(shippingList.get(i).getAddress())) {
                model.addObject("emailError", "address already exists");

                return model;
            }

           if(shipping.getUsername().equals(shippingList.get(i).getUsername())) {
                model.addObject("usernameError", "Username already exists");
                return model;
            }
            if(shipping.getUserPhone().equals(shippingList.get(i).getUserPhone())) {
                model.addObject("userPhoneError", "User phone already exists");
                return model;
            }
        }
		*/
	
	
		shippingDetailDAO.addUser(shipping);
		ModelAndView model=new ModelAndView("confirm order");
		return model;
	}
}