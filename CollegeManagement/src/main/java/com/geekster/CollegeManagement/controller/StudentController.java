package com.geekster.CollegeManagement.controller;

import com.geekster.CollegeManagement.model.Student;
import com.geekster.CollegeManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("Student")
    public String addStudent(@RequestBody Student newStudent){
        return studentService.addStudent(newStudent);
    }
    @GetMapping("Student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @DeleteMapping("Student/id/{id}")
    public String deleteStudentById(@PathVariable Long id){
        return studentService.deleteStudentById(id);
    }
}
