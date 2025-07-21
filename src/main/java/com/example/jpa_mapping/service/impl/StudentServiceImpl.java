package com.example.jpa_mapping.service.impl;

import com.example.jpa_mapping.entitiy.Address;
import com.example.jpa_mapping.entitiy.Student;
import com.example.jpa_mapping.repo.StudentRepo;
import com.example.jpa_mapping.service.StudentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
     StudentRepo studentRepo;
    @Transactional
    public void addStudent(Student student) {
        if (student.getLaptop() != null) {
            student.getLaptop().setStudent(student);
        }

        if (student.getAddress() != null) {
            for(Address address : student.getAddress()){
                address.setStudent(student);
            }
        }
        studentRepo.save(student);
    }
    public List<Student> getAllStudentInfo() {


        return studentRepo.findAll();
    }
}
