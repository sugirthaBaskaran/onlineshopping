package com.edubridge.onlineshop.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart_item")
public class Cart {
	

@Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "product_id")
	 private  Integer productId;
	
	@Column(name = "product_name")
	 private  String productName;
	
	@Column(name = "product_price")
	private int productprice;
	
	@Column(name = "quantity")
	 private int quantity;


	@Column( name = "total_amount")
	private int totalAmount;
	
	public Cart() {
		 
		 
	 }



	public Integer getProductId() {
		return productId;
	}



	public void setProductId(Integer productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public int getProductprice() {
		return productprice;
	}



	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public int getTotalAmount() {
		return totalAmount;
	}



	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}



	@Override
	public int hashCode() {
		return Objects.hash(productId, productName, productprice, quantity, totalAmount);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		return Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName)
				&& productprice == other.productprice && quantity == other.quantity && totalAmount == other.totalAmount;
	}



	@Override
	public String toString() {
		return "Cart [productId=" + productId + ", productName=" + productName + ", productprice=" + productprice
				+ ", quantity=" + quantity + ", totalAmount=" + totalAmount + "]";
	}

}

	