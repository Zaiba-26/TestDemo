package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
