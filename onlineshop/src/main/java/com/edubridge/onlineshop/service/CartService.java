package com.edubridge.onlineshop.service;

import java.util.List;

import com.edubridge.onlineshop.entities.Cart;



public interface CartService {
	
public Cart saveCart(Cart cart);
	
	public List<Cart> getAllCartItems();
    public Cart getCartById(int productId);
	public Cart updateCart(int productId,Cart cart);
	public void  deletecart(int productId);
}
