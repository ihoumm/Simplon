package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.ProductCategory;

public interface ProductCategoryService {

	
	List<ProductCategory> getAllProductCategories();
	
	ProductCategory addProductCategory(ProductCategory productCategory);
	
	ProductCategory getProductCategoryById(long id);
	
	ProductCategory updateProductCategory(ProductCategory productCategory, long id);

	void deleteProductCategoryById(long id);

}
