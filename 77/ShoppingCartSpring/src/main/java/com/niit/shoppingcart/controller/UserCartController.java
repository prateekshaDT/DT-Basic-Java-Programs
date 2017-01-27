package com.niit.shoppingcart.controller;

import com.niit.DAO.CartItemDao;
import com.niit.DAO.UsersDetailDao;
import com.niit.model.UsersDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



 /*This controller is called when user clicks on cart menu or button*/
 
@Controller
@RequestMapping("/user/cart")
public class UserCartController {

    @Autowired
    private UsersDetailDao usersDetailDao;
    
    @Autowired
    private CartItemDao cartItemDao;
    
    
     /*Initially getCart method is called to get user card items from database*/
     
    @RequestMapping
    public String getCartItems(){
    	//@AuthenticationPrincipal User activeUser
    	User activeUser = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        //String name = activeUser.getUsername(); //get logged in username
    	
    	UsersDetail usersDetail = usersDetailDao.getUserByUsername (activeUser.getUsername());
    	System.out.println(activeUser.getUsername());
      // System.out.println("inside /user/cart ");
    	
    	int cartId = usersDetail.getCart().getCartId();
        return "redirect:/user/cart/"+cartId;
    }
    /*getCartRedirect method is called from getCart method to set retrieved cart from the database.*/
     
    @RequestMapping("/{cartId}")
    public String getNewUrl(@PathVariable (value = "cartId") int cartId, Model model) {
        model.addAttribute("cartId", cartId);
        model.addAttribute("cartList", cartItemDao.getAllCartItems(cartId));
        //model.addAttribute("cartId", cartId);
        return "myCart";
    }
    
    /*@RequestMapping("/cart1")
    public String getcart() {
        
        return "cart";
    }*/
}
