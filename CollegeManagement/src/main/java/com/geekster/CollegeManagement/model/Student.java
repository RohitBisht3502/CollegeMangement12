package com.geekster.CollegeManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    private Integer studentAge;
    private String studentPhoneNumber;
    private String studentBranch;
    private String studentDepartment;
    @OneToOne
    private Address studentAddress;
    @OneToMany
    private Set<Course> coursesSet;
}
