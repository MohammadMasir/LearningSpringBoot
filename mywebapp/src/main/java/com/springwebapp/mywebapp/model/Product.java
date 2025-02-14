package com.springwebapp.mywebapp.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	private int prodId;
	private String prodName;
	private int price;
	
	public Product() {
	}
	
	public Product(int prodId, String prodName, int prodPrice) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = prodPrice;
	}
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
