package com.blog.example.services;

import java.util.List;

import com.blog.example.entities.Category;
import com.blog.example.payloads.CategoryDto;

public interface CategoryService {
	
	//create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
    //delete
	public void deleteCategory(Integer categoryId);
	
	//get
    CategoryDto getCategory(Integer categoryId);
    
    //get All
    List<CategoryDto> getCategories();
      
}
