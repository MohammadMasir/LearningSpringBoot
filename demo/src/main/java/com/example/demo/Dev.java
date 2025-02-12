package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
	
	// Field injection:-
	//@Autowired // Used to connect two different `@Component` without directly creating an object of `ApplicationContext`.
	private Computer computer;
	
	// Constructor injection:-
	public Dev(Computer computer) {
		this.computer = computer;
	}
	
	
	// Setter injection:-
	/* 
	@Autowired
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	*/
	
	public void build() {
		
		computer.compile();
		System.out.println("Working on awesome project");
	}
}
