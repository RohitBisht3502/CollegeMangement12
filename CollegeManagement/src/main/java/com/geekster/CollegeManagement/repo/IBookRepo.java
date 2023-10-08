package com.geekster.CollegeManagement.repo;

import com.geekster.CollegeManagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book,Long> {
}
