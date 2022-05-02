package com.tessa.products_and_categories.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tessa.products_and_categories.models.Product;
import com.tessa.products_and_categories.repos.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository prodRepo;
	
	// Read all 
	public List<Product> allProducts() {
		return prodRepo.findAll();
	}
	
	// Create 
	public Product createProduct(Product p) {
		return prodRepo.save(p);
	}
	
	// Update 
	public Product updateProduct(Product p) {
		return prodRepo.save(p);
	}
	
	// Read One 
	public Product findProduct(Long id) {
		Optional<Product> optionalProduct = prodRepo.findById(id);
		if (optionalProduct.isPresent()) {
			return optionalProduct.get();
		}
		return null;
	}
	
	// Delete 
	public void deleteProduct(Long id) {
		prodRepo.deleteById(id);
	}

}
