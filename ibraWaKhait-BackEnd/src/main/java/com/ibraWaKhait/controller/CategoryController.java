package com.ibraWaKhait.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ibraWaKhait.model.Category;
import com.ibraWaKhait.service.CategoryService;

public class CategoryController {
	
	private CategoryService categoryService;
	
	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}

	// build create Category REST API
	@PostMapping
	public ResponseEntity<Category> addCategory(@RequestBody Category category) {
		return new ResponseEntity<Category>(categoryService.addCategory(category), HttpStatus.CREATED);
	}

	// build get all Category REST API
	@GetMapping
	public List<Category> getAllCategorys() {
		return this.categoryService.getAllCategories();
	}

	// build get Category by id REST API
	// http://localhost:8080/api/categories/1
	@GetMapping("{id}")
	public ResponseEntity<Category> getCategoryById(@PathVariable("id") long category_id) {
		return new ResponseEntity<Category>(categoryService.getCategoryById(category_id), HttpStatus.OK);
	}

	// build update Category REST API
	// http://localhost:8080/api/categories/1
	@PutMapping("{id}")
	public ResponseEntity<Category> updateCategory(@PathVariable("id") long id, @RequestBody Category category) {
		return new ResponseEntity<Category>(categoryService.updateCategory(category, id), HttpStatus.OK);
	}

	// build delete Category REST API
	// http://localhost:8080/api/categories/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteCategory(@PathVariable("id") long id) {

		// delete Category from DB
		categoryService.deleteCategoryById(id);

		return new ResponseEntity<String>("Category deleted successfully!.", HttpStatus.OK);
	}

}
