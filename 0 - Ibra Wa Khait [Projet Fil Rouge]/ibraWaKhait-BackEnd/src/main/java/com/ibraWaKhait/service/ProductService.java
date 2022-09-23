package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.Product;

public interface ProductService {
	
	Product addProduct(Product product);
	
	List<Product> getAllProducts();

	Product getProductById(long id);
	
	Product updateProduct(Product product, long id);

	void deleteProductById(long id);
	
}
