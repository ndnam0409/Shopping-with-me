package com.dailycodework.shoppingwithme.service.category;

import com.dailycodework.shoppingwithme.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    Category getCategoryById(Long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();
    Category addCategory(Category category);
    Category updateCategory(Category category, Long id);
    void deleteCategoryById(Long id);
}
