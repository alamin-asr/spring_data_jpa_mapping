package com.example.jpa_mapping.repo;

import com.example.jpa_mapping.entitiy.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository <Student,Integer>{

}
