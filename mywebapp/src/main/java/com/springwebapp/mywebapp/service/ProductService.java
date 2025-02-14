package com.springwebapp.mywebapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springwebapp.mywebapp.model.Product;
@Service
public class ProductService {
	
	List<Product> products = Arrays.asList(
			new Product(1,"Laptop",50000),
			new Product(2, "iPhone", 750000)
			);
	
	public List<Product> getProduct(){
		return products;
		
	}

}
