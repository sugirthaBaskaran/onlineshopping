package com.edubridge.onlineshop.entities;

import java.util.Objects;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;

;

@Entity
@Table(name = "products_items")
public class Product {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
		@Column(name = "product_id")
	 private  Integer productId;
	
	@Column(name = "category")
	 private String  category;
	
	@Column(name = "brand_name")
	private String brand;
	
	@Column(name = "product_name")
	 private String productName;
	 
	@Column(name = "product_price")
	 private long  productPrice;
	
	@Column(name = "quantity")
	private int quantity;
	
	public Product() {
		 
		 
	 }


   public Integer getProductId() {
		return productId;
	}

   
   public void setProductId(Integer productId) {
		this.productId = productId;
	}




	public String getCategory() {
		return category;
	}




	public void setCategory(String category) {
		this.category = category;
	}




	public String getBrand() {
		return brand;
	}




	public void setBrand(String brand) {
		this.brand = brand;
	}




	public String getProductName() {
		return productName;
	}




	public void setProductName(String productName) {
		this.productName = productName;
	}




	public long getProductPrice() {
		return productPrice;
	}




	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	@Override
	public int hashCode() {
		return Objects.hash(brand, category, productId, productName, productPrice, quantity);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(category, other.category)
				&& Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName)
				&& productPrice == other.productPrice && quantity == other.quantity;
	}




	@Override
	public String toString() {
		return "Product [productId=" + productId + ", category=" + category + ", brand=" + brand + ", productName="
				+ productName + ", productPrice=" + productPrice + ", quantity=" + quantity + "]";
	}
    

}
