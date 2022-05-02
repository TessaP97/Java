package com.tessa.products_and_categories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tessa.products_and_categories.models.Category;
import com.tessa.products_and_categories.repos.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository cateRepo;
	
	// Read all 
	public List<Category> allCategories() {
		return cateRepo.findAll();
	}
	
	// Create
	public Category createCategory(Category c) {
		return cateRepo.save(c);
	}
	
	// Update
	public Category updateCategory(Category c) {
		return cateRepo.save(c);
	}
	
	// Read one
	public Category findCategory(Long id) {
		Optional<Category> optionalCategory = cateRepo.findById(id);
		if(optionalCategory. isPresent()) {
			return optionalCategory.get();
		}
		return null;
	}
	
	// Delete
	public void deleteCategory(Long id) {
		cateRepo.deleteById(id);
	}
	// --------------------------------------------------
	
	// Add Product to Category 
	
	public void assignProductCategory(Category c) {
		cateRepo.save(c);
	}
}
