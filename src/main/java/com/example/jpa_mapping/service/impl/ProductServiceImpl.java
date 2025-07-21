package com.example.jpa_mapping.service.impl;

import com.example.jpa_mapping.entitiy.Category;
import com.example.jpa_mapping.entitiy.Product;
import com.example.jpa_mapping.repo.CategoryRepo;
import com.example.jpa_mapping.repo.ProductRepo;
import com.example.jpa_mapping.service.ProductService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    private final CategoryRepo categoryRepo;
    @Transactional
    public void addProduct(Product product) {
        List<Category> attachedCategories = new ArrayList<>();

        for (Category cat : product.getCategory()) {
            Category existingCategory = categoryRepo.findByTitle(cat.getTitle())
                    .orElseGet(() -> {
                        Category newCat = new Category();
                        newCat.setTitle(cat.getTitle());
                        return categoryRepo.save(newCat);
                    });

            attachedCategories.add(existingCategory);
        }

        product.setCategory(attachedCategories);
        productRepo.save(product);
    }
}
