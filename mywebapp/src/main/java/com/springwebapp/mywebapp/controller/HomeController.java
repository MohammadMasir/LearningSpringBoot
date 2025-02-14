package com.springwebapp.mywebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String greet() {
		return "Welcome to My first SpringBoot WebApplication..";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "THE HOMEPAGE..";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "This is the about page..";
	}
	
}
