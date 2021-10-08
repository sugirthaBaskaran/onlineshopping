package com.edubridge.onlineshop.service;

import java.util.List;


import com.edubridge.onlineshop.entities.Product;


public interface ProductService {
	public Product saveProduct(Product product);
	public List<Product> getAllProductItems();
	   
		

}
