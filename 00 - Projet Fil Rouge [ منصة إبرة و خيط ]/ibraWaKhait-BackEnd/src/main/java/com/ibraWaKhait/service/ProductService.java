package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.Product;

public interface ProductService {
	
	List<Product> getAllProducts();
	
	Product addProduct(Product product);

	Product getProductById(long id);
	
	Product updateProduct(Product product, long id);

	void deleteProductById(long id);

}
