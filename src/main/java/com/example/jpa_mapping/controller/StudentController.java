package com.example.jpa_mapping.controller;
import com.example.jpa_mapping.entitiy.Student;
import com.example.jpa_mapping.service.impl.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    StudentServiceImpl studentServiceImpl;

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


}
