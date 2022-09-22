package com.ibraWaKhait.service.implementation;

import java.util.List;

import com.ibraWaKhait.exception.ResourceNotFoundException;
import com.ibraWaKhait.model.Category;
import com.ibraWaKhait.model.User;
import com.ibraWaKhait.repository.CategoryRepository;
import com.ibraWaKhait.service.CategoryService;

public class CategoryServiceImplementation implements CategoryService {
	
	private CategoryRepository categoryRepository;

	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		return this.categoryRepository.save(category);
	}

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Category getCategoryById(long id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id).get();
	}

	@Override
	public Category updateCategory(Category category, long id) {
		
		Category existingCategory = categoryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("activiteRepository", "id", id));
		
		existingCategory.setId(category.getId());
		existingCategory.setCategory_name(category.getCategory_name());
		existingCategory.setInserted_at(category.getInserted_at());
		existingCategory.setUpdated_at(category.getUpdated_at());
		existingCategory.setProducts(category.getProducts());
		
		categoryRepository.save(existingCategory);
		
		return existingCategory;
	}

	@Override
	public void deleteCategoryById(long id) {
		this.categoryRepository.deleteById(id);
		
	}

}
