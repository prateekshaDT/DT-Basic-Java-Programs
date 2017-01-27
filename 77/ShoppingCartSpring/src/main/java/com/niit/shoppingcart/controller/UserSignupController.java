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

import com.niit.DAO.UsersDetailDao;
import com.niit.model.UsersDetail;

/*
 * This Controller is used to signup user into the system
 */

@Controller
public class UserSignupController {
	
	@Autowired
	private UsersDetailDao usersDetailDAO;

	/*
	 * signupUserPost method is used to signup user into the system and to
	 * show signup related errors
	 */

	
	@RequestMapping("/signup")
	public String signupUser(Model model) {

		UsersDetail usersDetail = new UsersDetail();
		model.addAttribute("usersDetail", usersDetail);
		return "signup";
	}
	
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ModelAndView signupUserPost(@Valid @ModelAttribute("usersDetail") UsersDetail usersDetail,
			BindingResult result) {
		
	System.out.println(usersDetail.getUsername());
	System.out.println(	usersDetail.getUserFullName());
	System.out.println(	usersDetail.getUserId());
	System.out.println(	usersDetail.getUserEmail());
	System.out.println(	usersDetail.getUserPhone());
	System.out.println(	usersDetail.getPassword());
		
	      if (result.hasErrors()) {					
			ModelAndView model=new ModelAndView("signup");
			model.addObject("message", "You have entered invalid details");
			
			System.out.println("Page has errors");
			return model;
		}     
	
		List<UsersDetail> usersDetailList = usersDetailDAO.getAllUsers();

       for (int i=0; i< usersDetailList.size(); i++) {
        	ModelAndView model=new ModelAndView("signup");
        	if(usersDetail.getUserEmail().equals(usersDetailList.get(i).getUserEmail())) {
                model.addObject("emailError", "Email already exists");

                return model;
            }

            if(usersDetail.getUsername().equals(usersDetailList.get(i).getUsername())) {
                model.addObject("usernameError", "username already exists");
                return model;
            }
            if(usersDetail.getUserPhone().equals(usersDetailList.get(i).getUserPhone())) {
                model.addObject("userPhoneError", "userphone already exists");
                return model;
            }
        }
		/*if(usersDetailDAO.isValidUser(usersDetail.getUsername())==false){
			ModelAndView model=new ModelAndView("signup");
			model.addObject("usernameError", "username already exists");
			return model;
		}    */
		usersDetail.setEnabled(true);
		usersDetailDAO.addUser(usersDetail);
		ModelAndView model=new ModelAndView("signupsuccess");
		return model;
	}

}
