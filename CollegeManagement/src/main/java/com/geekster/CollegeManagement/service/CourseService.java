package com.geekster.CollegeManagement.service;

import com.geekster.CollegeManagement.model.Course;
import com.geekster.CollegeManagement.repo.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    ICourseRepo courseRepo;

    public String addCourse(Course newCourse) {
         courseRepo.save(newCourse);
         return "course added";
    }

    public List<Course> getAllCourse() {
      return courseRepo.findAll();
    }

    public String deleteCourseById(Long id) {
        courseRepo.deleteById(id);
        return "course delete";
    }
}
