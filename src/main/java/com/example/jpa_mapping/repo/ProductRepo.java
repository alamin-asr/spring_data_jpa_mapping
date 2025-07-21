package com.example.jpa_mapping.repo;

import com.example.jpa_mapping.entitiy.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}
