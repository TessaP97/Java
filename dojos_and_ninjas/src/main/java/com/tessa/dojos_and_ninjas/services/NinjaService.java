package com.tessa.dojos_and_ninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tessa.dojos_and_ninjas.models.Ninja;
import com.tessa.dojos_and_ninjas.repositories.NinjaRepo;

@Service
public class NinjaService {
	
	@Autowired
	private NinjaRepo ninjaRepo;
	
//	private final NinjaRepo ninjaRepo;
//	public NinjaService(NinjaRepo ninjaRepo) {
//		this.ninjaRepo = ninjaRepo;
//	}
	
	
	//Create
	public Ninja createNinja(Ninja n) {
		return ninjaRepo.save(n); 
	}
	
	
	// Read All 
	public List<Ninja> allNinjas() {
		return ninjaRepo.findAll();
	}
	
	
}
