package com.example.my_rest_api_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController 
{
	
	@GetMapping("/hello")
	public String SayHello()
	{
		return "<font color-blue size=10>Hello All </font>";
	}

}
