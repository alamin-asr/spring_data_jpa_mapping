package com.example.jpa_mapping.controller;

import com.example.jpa_mapping.entitiy.Product;
import com.example.jpa_mapping.service.impl.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    @Autowired
    ProductServiceImpl productServiceImpl;
    @PostMapping("addProduct")
    ResponseEntity<String> addProduct(@RequestBody Product product){
        productServiceImpl.addProduct(product);
        return ResponseEntity.ok("Product Added Successfully");
    }

}
