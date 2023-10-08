package com.geekster.CollegeManagement.controller;

import com.geekster.CollegeManagement.model.Book;
import com.geekster.CollegeManagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("Book")
    public String addBook(@RequestBody Book newBook){
      return  bookService.addBook(newBook);
    }
    @GetMapping("Book")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @DeleteMapping("Book/id/{id}")
    public String deleteBookById(@PathVariable Long id){
        return  bookService.deleteBookById(id);
    }
}
