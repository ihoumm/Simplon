package com.soussHealthOnlineStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soussHealthOnlineStore.entity.Product;
import com.soussHealthOnlineStore.repository.ProductRepository;

@Service
public class ProductServiceImpl implements PharmacieServices<Product>{
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	@Override
	public Product getById(Long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void update(Product product, Long id) {
		Product product1 = productRepository.findById(id).get();
		product1.setTitle(product.getTitle());
		product1.setDescription(product.getDescription());
//		product1.setCategorie(product.getCategorie());
		product1.setQuantity(product.getQuantity());
//		product1.setOrders(product.getOrders());
		productRepository.save(product1);
	}

	@Override
	public void delete(Long id) {
		productRepository.deleteById(id);
		
	}

	@Override
	public List<Product> findByNameOrPartName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
