package com.tessa.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tessa.languages.models.Language;
import com.tessa.languages.services.LanguageService;

@Controller
public class LanguagesController {
		 private final LanguageService languageService;
		    
		 public LanguagesController(LanguageService languageService) {
		     this.languageService = languageService;
	}
		// Create (if the results have errors.. spring will render on a post request to display validations)
		 
		 @RequestMapping(value="/languages", method=RequestMethod.POST)
		   	public String create(@Valid @ModelAttribute("createNew") Language language, BindingResult result, Model model) {
		        if (result.hasErrors()) {
		        	List<Language> languages = languageService.allLanguages();
		        	model.addAttribute("languages",languages);
		            return "/languages/index.jsp";
		        } else {
		            languageService.createLanguage(language);
		            return "redirect:/languages";
		        }
		    }
		 
		 
		 // Read
		 
		 @RequestMapping("/languages")
		 	public String index(@ModelAttribute("createNew") Language language, Model model) {
			 List<Language> languages = languageService.allLanguages();
		     model.addAttribute("languages", languages);
		     return "/languages/index.jsp";
		 }
		     
		 @RequestMapping("/languages/{id}")
			 public String show(@PathVariable("id") Long id, Model model) {
				 Language language = languageService.findLanguage(id);
				 model.addAttribute("language", language);
				 return "/languages/show.jsp";
		}
		    
		    
		    
		 // Update
		    
		    @RequestMapping("/languages/edit/{id}")
		    public String edit(@PathVariable("id") Long id, Model model) {
		        Language language = languageService.findLanguage(id);
		        model.addAttribute("language", language);
		        return "/languages/edit.jsp";
		    }
		    
		    @RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
		    public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		        if (result.hasErrors()) {
		            return "/languages/edit.jsp";
		        } else {
		            languageService.updateLanguage(language);
		            return "redirect:/languages";
		        }
		    }
		    
		   // Delete
		    
		    @RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
		    public String destroy(@PathVariable("id") Long id) {
		        languageService.deleteLanguage(id);
		        	return "redirect:/languages";
		   }
}
