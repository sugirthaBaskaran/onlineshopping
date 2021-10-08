package com.edubridge.onlineshop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.edubridge.onlineshop.entities.Cart;
import com.edubridge.onlineshop.repository.CartRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class RespositoryTests {

	
	@Autowired
	private TestEntityManager testEntityManager;
	
	@Autowired
	CartRepository cartRespository;
	
	
	@Test
	public void testCreateCart() {
	  Cart cart = new Cart();
	  cart.setProductName("jewels");
	  cart.setProductprice(500);
	  cart.setQuantity(1);
	  cart.setTotalAmount(500);
	    Cart savedCart = cartRespository.save(cart);
	     
	}
	
	
	
	
	

}

