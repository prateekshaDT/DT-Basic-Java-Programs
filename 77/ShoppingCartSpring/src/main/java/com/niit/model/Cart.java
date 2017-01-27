package com.niit.model;

import javax.persistence.*;

//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import com.niit.model.UsersDetail;

@Entity
public class Cart implements Serializable{
	
	
	private static final long serialVersionUID = 9L;

	@Id
    @GeneratedValue
    private int cartId;

	
   

    @OneToOne
    @JoinColumn(name = "userId")
   // @JsonIgnore
    private UsersDetail usersDetail;
    
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CartItem> cartItems;
        
	private double grandTotal;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }
    
    public UsersDetail getUsersDetail() {
		return usersDetail;
	}

	public void setUsersDetail(UsersDetail usersDetail) {
		this.usersDetail = usersDetail;
	}
}
