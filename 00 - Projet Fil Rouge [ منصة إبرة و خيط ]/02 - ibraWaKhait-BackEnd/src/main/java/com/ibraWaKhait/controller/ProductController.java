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
import com.ibraWaKhait.model.Product;
import com.ibraWaKhait.service.ProductService;

public class ProductController {
	
	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	// build create Product REST API
		@PostMapping
		public ResponseEntity<Product> addProduct(@RequestBody Product product) {
			return new ResponseEntity<Product>(productService.addProduct(product), HttpStatus.CREATED);
		}

		// build get all Product REST API
		@GetMapping()
		public List<Product> getAllProducts() {
			return productService.getAllProducts();
		}

		// build get Product by id REST API
		// http://localhost:8080/api/products/1
		@GetMapping("{id}")
		public ResponseEntity<Product> getProductById(@PathVariable("id") long product_id) {
			return new ResponseEntity<Product>(productService.getProductById(product_id), HttpStatus.OK);
		}

		// build update Product REST API
		// http://localhost:8080/api/products/1
		@PutMapping("{id}")
		public ResponseEntity<Product> updateProduct(@PathVariable("id") long id, @RequestBody Product product) {
			return new ResponseEntity<Product>(productService.updateProduct(product, id), HttpStatus.OK);
		}

		// build delete Product REST API
		// http://localhost:8080/api/products/1
		@DeleteMapping("{id}")
		public ResponseEntity<String> deleteProduct(@PathVariable("id") long id) {

			// delete Product from DB
			productService.deleteProductById(id);

			return new ResponseEntity<String>("Product deleted successfully!.", HttpStatus.OK);
		}

}
