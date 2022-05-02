package com.tessa.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tessa.languages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
	List<Language> findAll();
	
	
	    // this method finds languages with names containing the search string
	    //List<Language> findByNameContaining(String search);
	    // this method counts how many versions contain a certain string
	    //Long countByVersionContaining(String search);
	    // this method deletes a language that starts with a specific title
	   //Long deleteByNameStartingWith(String search);

}
