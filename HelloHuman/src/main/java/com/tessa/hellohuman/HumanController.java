package com.tessa.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
			if(searchQuery == null) {
				return "<h1>Hello Human!</h1>"
						+ "<br>"
						+ "<h2>Welcome to SpringBoot</h2>";
			} else {
				return "<h1>Hello</h1> " + searchQuery + "<h1>!</h1>"
						+ "<br>"
						+ "<h1>Welcome to SpringBoot!</h1>";
			}
	}
	

}
