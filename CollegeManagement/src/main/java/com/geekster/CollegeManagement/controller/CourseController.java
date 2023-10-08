package com.geekster.CollegeManagement.controller;

import com.geekster.CollegeManagement.model.Course;
import com.geekster.CollegeManagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("Course")
    public String addCourse(@RequestBody Course newCourse){
        return courseService.addCourse(newCourse);
    }
    @GetMapping("Course")
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }
    @DeleteMapping("Course/id/{id}")
    public String deleteCourseById(@PathVariable Long id){
        return courseService.deleteCourseById(id);
    }





}
