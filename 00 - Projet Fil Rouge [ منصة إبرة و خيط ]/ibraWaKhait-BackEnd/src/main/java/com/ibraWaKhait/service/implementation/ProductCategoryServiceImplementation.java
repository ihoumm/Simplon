package com.ibraWaKhait.service.implementation;

import java.util.List;

import com.ibraWaKhait.exception.ResourceNotFoundException;
import com.ibraWaKhait.model.ProductCategory;
import com.ibraWaKhait.repository.ProductCategoryRepository;
import com.ibraWaKhait.service.ProductCategoryService;

public class ProductCategoryServiceImplementation implements ProductCategoryService {
	
	private ProductCategoryRepository productCategoryRepository;

	@Override
	public List<ProductCategory> getAllProductCategories() {
		// TODO Auto-generated method stub
		return this.productCategoryRepository.findAll();
	}

	@Override
	public ProductCategory addProductCategory(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return productCategoryRepository.save(productCategory);
	}

	@Override
	public ProductCategory getProductCategoryById(long id) {
		// TODO Auto-generated method stub
		return this.productCategoryRepository.findById(id).get();
	}

	@Override
	public ProductCategory updateProductCategory(ProductCategory productCategory, long id) {
		ProductCategory exestingProductCategory = productCategoryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("productCategoryRepository", "id", id));
		
		exestingProductCategory.setId(productCategory.getId());
		exestingProductCategory.setName(productCategory.getName());
		exestingProductCategory.setProducts(productCategory.getProducts());
		
		productCategoryRepository.save(exestingProductCategory);
		
		return exestingProductCategory;
	}

	@Override
	public void deleteProductCategoryById(long id) {
		this.productCategoryRepository.deleteById(id);		
	}

}
