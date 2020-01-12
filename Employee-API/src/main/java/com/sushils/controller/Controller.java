package com.sushils.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/hello")
	public String welcome()
	{
		return "Welcome Employee in SPring Boot World";
	}
	
}
