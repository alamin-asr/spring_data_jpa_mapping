package com.example.jpa_mapping.repo;

import com.example.jpa_mapping.entitiy.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
    Optional<Category> findByTitle(String title);
}
