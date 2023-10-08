package com.geekster.CollegeManagement.repo;

import com.geekster.CollegeManagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student,Long> {
}
