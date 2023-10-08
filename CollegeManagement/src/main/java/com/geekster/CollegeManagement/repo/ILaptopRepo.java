package com.geekster.CollegeManagement.repo;

import com.geekster.CollegeManagement.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop,Long> {
}
