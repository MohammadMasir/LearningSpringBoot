package com.springwebapp.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String greet() {
		return "Welcome to My first SpringBoot WebApplication..";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "This is the about page..";
	}
	
}
