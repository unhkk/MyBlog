package com.unhkk.service;

import com.unhkk.entity.Category;

import java.util.List;

public interface CategoryService {

	List<Category> selectAllCategory();

	Integer selectCategoryBySlug(String blogCategory);

	Category selectByPrimaryKey(Integer cgid);

	int selectCountOfCategory();

	String selectCategoryNameById(Integer cgid);

	int updateCategory(Category category);

	int deleteCategory(int parseInt);

	int insertCategory(Category category);
}
