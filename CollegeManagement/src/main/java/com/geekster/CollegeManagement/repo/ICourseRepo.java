package com.geekster.CollegeManagement.repo;

import com.geekster.CollegeManagement.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,Long> {
}
