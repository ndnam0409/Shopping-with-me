package com.dailycodework.shoppingwithme.repository;

import com.dailycodework.shoppingwithme.model.Category;
import com.dailycodework.shoppingwithme.service.category.CategoryService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
