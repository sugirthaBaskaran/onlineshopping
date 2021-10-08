package com.edubridge.onlineshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.edubridge.onlineshop.entities.Product;
import com.edubridge.onlineshop.repository.ProductRepository;
import com.edubridge.onlineshop.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {
	
	
	@Autowired
	ProductRepository productRepository;

	
	@Override
	public List<Product> getAllProductItems() {
		return  productRepository.findAll() ;
	}

	@Override
	public Product saveProduct(Product product) {
	
		return productRepository.save(product);
	}

	
}
