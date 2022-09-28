package com.ibraWaKhait.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ibraWaKhait.model.ProductCategory;
import com.ibraWaKhait.service.ProductCategoryService;

public class ProductCatregoryController {
	
	private ProductCategoryService productCategoryService;

	public ProductCatregoryController(ProductCategoryService productCategoryService) {
		super();
		this.productCategoryService = productCategoryService;
	}
	
	// build create ProductCategory REST API
			@PostMapping
			public ResponseEntity<ProductCategory> addProductCategory(@RequestBody ProductCategory productCategory) {
				return new ResponseEntity<ProductCategory>(productCategoryService.addProductCategory(productCategory), HttpStatus.CREATED);
			}

			// build get all ProductCategory REST API
			@GetMapping()
			public List<ProductCategory> getAllProductCategories() {
				return productCategoryService.getAllProductCategories();
			}

			// build get Product by id REST API
			// http://localhost:8080/api/productCategory/1
			@GetMapping("{id}")
			public ResponseEntity<ProductCategory> getProductCategoryById(@PathVariable("id") long productCategory_id) {
				return new ResponseEntity<ProductCategory>(productCategoryService.getProductCategoryById(productCategory_id), HttpStatus.OK);
			}

			// build update ProductCategory REST API
			// http://localhost:8080/api/productCategory/1
			@PutMapping("{id}")
			public ResponseEntity<ProductCategory> updateProductCategory(@PathVariable("id") long id, @RequestBody ProductCategory productCategory) {
				return new ResponseEntity<ProductCategory>(productCategoryService.updateProductCategory(productCategory, id), HttpStatus.OK);
			}

			// build delete ProductCategory REST API
			// http://localhost:8080/api/productCategory/1
			@DeleteMapping("{id}")
			public ResponseEntity<String> deleteProductCategory(@PathVariable("id") long id) {

				// delete ProductCategory from DB
				productCategoryService.deleteProductCategoryById(id);

				return new ResponseEntity<String>("ProductCategory deleted successfully!.", HttpStatus.OK);
			}

}
