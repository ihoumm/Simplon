package com.ibraWaKhait.service.implementation;

import java.util.List;

import com.ibraWaKhait.exception.ResourceNotFoundException;
import com.ibraWaKhait.model.Product;
import com.ibraWaKhait.repository.ProductRepository;
import com.ibraWaKhait.service.ProductService;

public class ProductServiceImplementation implements ProductService {
	
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return this.productRepository.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		return this.productRepository.findById(id).get();
	}

	@Override
	public Product updateProduct(Product product, long id) {
		Product ExestingProduct = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("productRepository", "id", id));
		
		ExestingProduct.setId(product.getId());
		ExestingProduct.setSku(product.getSku());
		ExestingProduct.setName(product.getName());
		ExestingProduct.setDescription(product.getDescription());
		ExestingProduct.setPrice(product.getPrice());
		ExestingProduct.setImageUrl(product.getImageUrl());
		ExestingProduct.setUnitsInStock(product.getUnitsInStock());
		ExestingProduct.setInserted_at(product.getInserted_at());
		ExestingProduct.setUpdated_at(product.getUpdated_at());
		
		productRepository.save(ExestingProduct);
		
		return ExestingProduct;
	}

	@Override
	public void deleteProductById(long id) {
		this.productRepository.deleteById(id);
		
	}

}
