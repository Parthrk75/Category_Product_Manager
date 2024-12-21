package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.entity.Category;
import com.example.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
	
	@Autowired
    private CategoryRepository categoryRepository;

	public Page<Category> getAllCategories(Pageable pageable) {
		return categoryRepository.findAll(pageable);
	}

	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}

	public Category getCategoryById(Long id) {
		return categoryRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Category not found"));
	}

	public Category updateCategory(Long id, Category category) {
		Category existing = getCategoryById(id);
		existing.setName(category.getName());
		return categoryRepository.save(existing);
	}

	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}
}
