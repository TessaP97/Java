package com.tessa.languages.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tessa.languages.models.Language;
import com.tessa.languages.services.LanguageService;

@RestController
public class LanguagesApi {
	
	private final LanguageService languageService;
	
	public LanguagesApi(LanguageService languageService){
		this.languageService = languageService;
}

	// read all
	@RequestMapping("/api/languages")
	public List<Language> index() {
	   return languageService.allLanguages();
}
	// create
	@RequestMapping(value="/api/languages", method=RequestMethod.POST)
	public Language create(@RequestParam(value="name") String name, @RequestParam(value="creator") String creator, @RequestParam(value="version") String version) {
		Language language = new Language(name, creator, version);
	        return languageService.createLanguage(language);
}
	// read one 
	@RequestMapping("/api/languages/{id}")
	public Language show(@PathVariable("id") Long id) {
	    Language language = languageService.findLanguage(id);
	        return language;
	     }
	}

