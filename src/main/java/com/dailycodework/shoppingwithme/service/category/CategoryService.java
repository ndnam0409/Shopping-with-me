package com.dailycodework.shoppingwithme.service.category;

import com.dailycodework.shoppingwithme.exception.ResourceNotFoundException;
import com.dailycodework.shoppingwithme.model.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService {
    private final CategoryService categoryService;
    @Override
    public Category getCategoryById(Long id) {
        return categoryService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found!"));
    }

    @Override
    public Category getCategoryByName(String name) {
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        return List.of();
    }

    @Override
    public Category addCategory(Category category) {
        return null;
    }

    @Override
    public Category updateCategory(Category category, Long id) {
        return null;
    }

    @Override
    public void deleteCategoryById(Long id) {

    }
}
