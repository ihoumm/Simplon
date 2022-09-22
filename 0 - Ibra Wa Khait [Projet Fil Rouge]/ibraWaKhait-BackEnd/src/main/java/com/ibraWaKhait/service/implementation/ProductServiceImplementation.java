package com.ibraWaKhait.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibraWaKhait.exception.ResourceNotFoundException;
import com.ibraWaKhait.model.Order;
import com.ibraWaKhait.model.Product;
import com.ibraWaKhait.repository.ProductRepository;
import com.ibraWaKhait.service.ProductService;

@Service
public class ProductServiceImplementation implements ProductService{
	
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return this.productRepository.save(product);
	}

	@Override
	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

	@Override
	public Product updateProduct(Product product, long id) {
		
		Product existingProduct = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("invoiceRepository", "id", id));
		
		existingProduct.setId(product.getId());
		existingProduct.setProduct_sku(product.getProduct_sku());
		existingProduct.setProduct_name(product.getProduct_name());
		existingProduct.setDescription(product.getDescription());
		existingProduct.setUnit_price(product.getUnit_price());
		existingProduct.setImage_url(product.getImage_url());
		existingProduct.setIs_active(product.getIs_active());
		existingProduct.setUnits_in_stock(product.getUnits_in_stock());
		existingProduct.setInserted_at(product.getInserted_at());
		existingProduct.setUpdated_at(product.getUpdated_at());
		existingProduct.setCategory(product.getCategory());
		
		
		productRepository.save(existingProduct);
		
		return existingProduct;
		
	}

	@Override
	public void deleteProductById(long id) {
		this.productRepository.deleteById(id);
		
	}


}
