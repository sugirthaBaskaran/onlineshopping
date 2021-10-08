package com.edubridge.onlineshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.onlineshop.entities.Cart;
import com.edubridge.onlineshop.exception.CardItemsDoesNotExist;
import com.edubridge.onlineshop.exception.ProductDoesNotExist;
import com.edubridge.onlineshop.service.CartService;


@RestController
public class CartController {
	
	@Autowired
	
  CartService cartService;
	
	
	// to update cart items  in the table
	@PostMapping("/cart/add")
	public Cart saveCart (@RequestBody Cart cart) {
		
		return cartService.saveCart(cart);
	}
	
	@GetMapping("/cart/cartitems")
	public  List<Cart> getAllCartItems(){
		
		return cartService.getAllCartItems();
	}
	
	//get all cart items in the table
    @GetMapping("/cart/{id}")
	public ResponseEntity<Cart> getCartById (@PathVariable int id){
		
	   if(id <= 0) {
		throw new CardItemsDoesNotExist(id+ "  it is not a valid  product Id" );
	    }
	
	   Cart cart = cartService.getCartById(id)	; // get all cart item in the table
       return new ResponseEntity<Cart>(cart,HttpStatus.OK);
	}


    @DeleteMapping("/cart/{id}")
	public String deleteCart(@PathVariable int id) {
 
		// cart item table does not allow negative value
    	
		if(id <= 0) {
			throw new CardItemsDoesNotExist(id+ "  it is not a valid  product Id" );
		}
		
	    cartService.deletecart(id); // delete the product items in the cart
		return "Delete successfully";
		}
	
	@PutMapping("/cartitems/{id}")
	public ResponseEntity <Cart> updateProduct (@PathVariable(value ="id") int productId,@RequestBody Cart cart){
		
	    // cart item table does not allow negative value
		
		if(productId <= 0) {
			throw new ProductDoesNotExist(productId+ " it is invalid product Id");
		}
		
		Cart updatedProduct= cartService.updateCart(productId, cart); // update cart items in the the table
		return ResponseEntity.ok(updatedProduct);

	}
}
