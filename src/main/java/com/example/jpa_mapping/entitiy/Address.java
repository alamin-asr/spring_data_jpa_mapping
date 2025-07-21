package com.example.jpa_mapping.entitiy;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  private String street;
 private String city;
 private String state;
 private String country;
    @ManyToOne
    @JoinColumn(name = "student_id")
    @JsonBackReference
    private Student student;



}
