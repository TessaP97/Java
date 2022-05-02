package com.tessa.products_and_categories.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tessa.products_and_categories.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	List<Category> findAll();
}
