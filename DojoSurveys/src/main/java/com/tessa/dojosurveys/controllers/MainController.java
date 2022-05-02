package com.tessa.dojosurveys.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		session.setAttribute("x", 11);
		
		ArrayList<String> dojos = new ArrayList<String>();
	    dojos.add("Burbank");
	    dojos.add("Chicago");
	    dojos.add("Bellevue");
	    model.addAttribute("dojosFromMyController", dojos);
	    return "index.jsp";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(@RequestParam(value="name") String name,
    					@RequestParam(value="location") String location,
    					@RequestParam(value="language") String language,
    					@RequestParam(value="comment") String comment,
    					RedirectAttributes redirectAttributes,
    					HttpSession session) {
		System.out.println(name + " from " + location + " loves to code in " + language);
		session.setAttribute("form_name", name);
		session.setAttribute("form_location", location);
		session.setAttribute("form_language", language);
		session.setAttribute("form_comment", comment);
		return "redirect:/results";
	}
	
	@RequestMapping(value="/return", method=RequestMethod.GET)
	public String returnToIndex() {
		return "index.jsp";
	}
	
	
	@RequestMapping("/results")
	public String results() {
		return "results.jsp";
	}

}
