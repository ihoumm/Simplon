package com.soussHealthOnlineStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.soussHealthOnlineStore.entity.Product;
import com.soussHealthOnlineStore.service.ProductServiceImpl;



@RestController
@RequestMapping("/api/v1/pharmacie/products")
public class ProductsController {
	@Autowired
	private ProductServiceImpl prodImpl;

	public ProductsController(ProductServiceImpl prodImpl) {
		super();
		this.prodImpl = prodImpl;
	}

	@GetMapping("/allProducts")
	  List<Product> findAll() {
	    return prodImpl.getAll();

	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Product createUser(@RequestBody Product product) {
		return prodImpl.save(product);
}
	
	@GetMapping("{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Product getUserById(@PathVariable Long id) {
		return prodImpl.getById(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Product>  updateUser(@PathVariable("id") Long id, @RequestBody Product product) {
		prodImpl.update(product, id);
		return  new ResponseEntity<>(prodImpl.getById(id), HttpStatus.OK) ;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void deleteUser(@PathVariable Long id) {
		prodImpl.delete(id);

	}
}
	
