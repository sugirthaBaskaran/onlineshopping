package com.edubridge.onlineshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edubridge.onlineshop.entities.Cart;
import com.edubridge.onlineshop.service.CartService;

@Controller
public class CardViewController {

	@Autowired 
	CartService cartService;
	
	
	@RequestMapping("/")
	
	public String viewIndexPage(Model model) {
		
		List<Cart> cartList = cartService.getAllCartItems();
		model.addAttribute("cartList", cartList);
		return "index";
	}
	
	@RequestMapping("/new")
	public String viewNewProduct(Model model) {
		Cart cart = new Cart();
		model.addAttribute("cart", cart);
		return "new_product";
	}
	
	@RequestMapping(value = "/save", method =RequestMethod.POST)
	public  String saveCart(@ModelAttribute("cart")Cart cart) {
		cartService.saveCart(cart);
		return "redirect:/";
		
		
	}
	
}
