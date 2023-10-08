package com.geekster.CollegeManagement.service;

import com.geekster.CollegeManagement.model.Student;
import com.geekster.CollegeManagement.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String addStudent(Student newStudent) {
        studentRepo.save(newStudent);
        return "added";
    }

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public String deleteStudentById(Long id) {
        studentRepo.deleteById(id);
        return "delete";
    }
}
