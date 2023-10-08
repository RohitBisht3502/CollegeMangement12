package com.geekster.CollegeManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    private String bookTitle;
    private String bookAuthor;
    private String bookDescription;
    private Integer BOOKPrice;
    @ManyToOne
    private Student student;
}
