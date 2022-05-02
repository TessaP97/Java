package com.tessa.dojos_and_ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tessa.dojos_and_ninjas.models.Dojo;
import com.tessa.dojos_and_ninjas.repositories.DojoRepo;

@Service
public class DojoService {
	
	@Autowired
	private DojoRepo dojoRepo;
	
//	private final DojoRepo dojoRepo;
//	public DojoService(DojoRepo dojoRepo) {
//		this.dojoRepo = dojoRepo;
//	}
	
	// Create
	
	public Dojo createDojo(Dojo d) {
		return dojoRepo.save(d);
	}
	
	
	// Read All 
	public List<Dojo> allDojos() {
		return dojoRepo.findAll();
	}
	
	// Read one
	public Dojo singleDojo(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
		}
		else {
			return null;
		}
	}
	
	
	
}
