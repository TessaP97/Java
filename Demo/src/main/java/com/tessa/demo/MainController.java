package com.tessa.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	//@RequestMapping("/route")
	public String index() {
		return "<h1 style='color: red;'> Hello World </h1>";
	}

}
