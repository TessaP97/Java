package com.tessa.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {
	
	@RequestMapping("/") 
	public String mainIndex(Model model) {
		String x = "this is from line 12 in the jsp controller";
		model.addAttribute("myKey", x);
		return "index.jsp";
	}
}
