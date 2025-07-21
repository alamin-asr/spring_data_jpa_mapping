package com.example.jpa_mapping.service;

import com.example.jpa_mapping.entitiy.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    List<Student> getAllStudentInfo();

}
