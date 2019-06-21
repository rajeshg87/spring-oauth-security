package com.rajesh.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@RequestMapping("/greet")
	public String greet() {
		return "Hi Rajesh";		
	}

}
