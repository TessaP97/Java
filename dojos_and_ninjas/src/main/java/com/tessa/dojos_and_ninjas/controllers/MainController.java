package com.tessa.dojos_and_ninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tessa.dojos_and_ninjas.models.Dojo;
import com.tessa.dojos_and_ninjas.models.Ninja;
import com.tessa.dojos_and_ninjas.services.DojoService;
import com.tessa.dojos_and_ninjas.services.NinjaService;

@Controller
public class MainController {

	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}

	
	// ---------- Create ------------
	
	// New Dojo
	@GetMapping("/dojos")
	public String newDojo(@ModelAttribute Dojo dojo, Model model) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "newDojo.jsp";
	}
	@PostMapping("/dojos")
	public String createDojo(@Valid @ModelAttribute Dojo dojo, BindingResult res, Model model) {
		
		if (res.hasErrors()) {
			model.addAttribute("dojos", dojoService.allDojos());
			return "newDojo.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/dojos";
		}
		
	}
	
	
	// New Ninja
	@GetMapping("/ninjas")
	public String newNinja(@ModelAttribute Ninja ninja, Model model) {
		
		model.addAttribute("dojos", dojoService.allDojos());
		model.addAttribute("ninjas", ninjaService.allNinjas());
		return "newNinja.jsp";
	}
	@PostMapping("/ninjas")
	public String createNinja(@Valid @ModelAttribute Ninja ninja, BindingResult res, Model model) {
		
		if (res.hasErrors()) {
			model.addAttribute("dojos", dojoService.allDojos());
			return "newNinja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/ninjas";
		}
	
	}

	// -------------- Read ---------------
	
	@GetMapping("/dojos/{dojoId}")
	public String showDojo(@PathVariable("dojoId") long id, Model model) {
		Dojo dojo = dojoService.singleDojo(id);
		model.addAttribute("dojo",dojo);
		return "show.jsp";
	}
	    
	
	
	
}
