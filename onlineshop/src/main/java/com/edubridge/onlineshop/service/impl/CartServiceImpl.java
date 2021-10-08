package com.edubridge.onlineshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.onlineshop.entities.Cart;
import com.edubridge.onlineshop.repository.CartRepository;
import com.edubridge.onlineshop.service.CartService;


@Service
public class CartServiceImpl  implements  CartService{
	
	@Autowired
	
	CartRepository cartRepo;

	@Override
	public Cart saveCart(Cart cart) {
		
		return cartRepo.save(cart);
	}

	@Override
	public List<Cart> getAllCartItems() {
		
		return cartRepo.findAll();
	}

	@Override
	public Cart getCartById(int productId) {
		
		return cartRepo.findById(productId).get();
	}

	@Override
	public void deletecart(int productId) {
		cartRepo.deleteById(productId);
		
	}

	@Override
	public Cart updateCart(int productId, Cart cart) {
		
		Cart d1 = getCartById(productId);
		d1.setQuantity(cart.getQuantity());
		return cartRepo.save(d1);
	}

}
	