package com.practice.springboot.controller;

import com.practice.springboot.dao.StudentRepository;
import com.practice.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class StudentController {
    @Autowired
    public StudentRepository studentRepository;
    @PostMapping("/create")
    public void CreateStudent(@RequestBody Student student){
        studentRepository.insert(student);

    }
    @PostMapping("/delete/{id}")
    public void DeleteStudent(@PathVariable String id){
        studentRepository.deleteById(id);
    }

    @GetMapping("/list")
    public List<Student> ListStudents(){
    return studentRepository.findAll();
    }
}
