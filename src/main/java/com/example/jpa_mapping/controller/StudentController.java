package com.example.jpa_mapping.controller;



import com.example.jpa_mapping.entitiy.Product;
import com.example.jpa_mapping.entitiy.Student;
import com.example.jpa_mapping.service.impl.ProductServiceImpl;
import com.example.jpa_mapping.service.impl.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    StudentServiceImpl studentServiceImpl;
    @Autowired
    ProductServiceImpl productServiceImpl;
    public StudentController(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }
    @GetMapping("/info")
    ResponseEntity<List<Student>> getStudentInfo(){

        return ResponseEntity.ok(studentServiceImpl.getAllStudentInfo());
    }
    @PostMapping("/add")
    ResponseEntity<String> addStudent(@RequestBody Student student){

        studentServiceImpl.addStudent(student);
        return ResponseEntity.ok("Student Added Successfully");

    }
    @PostMapping("addProduct")
    ResponseEntity<String> addProduct(@RequestBody Product product){
        productServiceImpl.addProduct(product);
        return ResponseEntity.ok("Product Added Successfully");
    }

}
