package com.geekster.CollegeManagement.service;

import com.geekster.CollegeManagement.model.Book;
import com.geekster.CollegeManagement.repo.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepo bookRepo;

    public String addBook(Book newBook) {
        bookRepo.save(newBook);
        return "Book added";
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public String deleteBookById(Long id) {
        bookRepo.deleteById(id);
        return "deleted successfully";
    }
}
