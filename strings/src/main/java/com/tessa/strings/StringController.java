package com.tessa.strings;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello Client! How are you doing? ";
	}
	
	@RequestMapping("/random")
	public String message() {
		return "Spring Boot is great! So easy to just respond with strings";
	}
	

}
