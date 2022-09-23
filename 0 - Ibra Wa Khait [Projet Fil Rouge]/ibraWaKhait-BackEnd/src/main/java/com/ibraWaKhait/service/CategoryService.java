package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.Category;
import com.ibraWaKhait.model.User;

public interface CategoryService {

	Category addCategory(Category category);
	
	List<Category> getAllCategories();
	
	Category getCategoryById(long id);
	
	Category updateCategory(Category category, long id);

	void deleteCategoryById(long id);
	
}
