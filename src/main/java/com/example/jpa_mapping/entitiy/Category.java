package com.example.jpa_mapping.entitiy;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    @ManyToMany(mappedBy = "category", cascade = CascadeType.PERSIST)
    private List<Product> product= new ArrayList<>();

}
