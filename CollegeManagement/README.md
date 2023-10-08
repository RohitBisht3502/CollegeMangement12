# <h1 align = "center"> College Application API </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.3-brightgreen.svg" />
</a>
    <img alt = "License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" />
    </a>
</p>


---

<p align="left">

## Overview

The College Management Application is a Spring Boot-based web application designed to help manage College information. It allows users to perform various operations related to College management, including adding new students, updating address, and deleting books and address from the system.

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

## Data Flow

### Controller

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for the following operations:

1. **Address Controller** `CREATE /Users` and GET/Users`
   
   This endpoint creare employee and get employee by using user id.

   ```java
   @PostMapping("Address")
    public String addAddress(@RequestBody Address newAddress){
       return addressService.addAddress(newAddress);
    }
    @GetMapping("Address")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
    @DeleteMapping("Address/id/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }
   ```

2. **Book Controller:** 

   This endpoint create a product and get all product and delete product such type of operation is in this.

   ```java
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
   ```
   3. **Course Controller:** 

   This endpoint create a product and get all product and delete product such type of operation is in this.

   ```java
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
   ```
   4. **Student Controller:** 

   This endpoint create a product and get all product and delete product such type of operation is in this.

   ```java
     @PostMapping("Student")
    public String addStudent(@RequestBody Student newStudent){
        return studentService.addStudent(newStudent);
    }
    @GetMapping("Student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @DeleteMapping("Student/id/{id}")
    public String deleteStudentById(@PathVariable Long id){
        return studentService.deleteStudentById(id);
    }
   ```
   5. **Laptop Controller:** 

   This endpoint create a product and get all product and delete product such type of operation is in this.

   ```java
      @PostMapping("Laptop")
    public String addLaptop(@RequestBody Laptop newLaptop){
        return laptopService.addLaptop(newLaptop);
    }
    @GetMapping("Laptop")
    public List<Laptop> getAllLaptop(){
        return laptopService.getAllLaptop();
    }
    @DeleteMapping("Laptop/id/{id}")
    public String deleteLaptopById(@PathVariable Long id){
        return  laptopService.deleteLaptopById(id);
    }
   ```
The Services layer implements the core business logic, data processing, and interaction with the data repository. Key responsibilities include:

- Validating input data.
- Performing CRUD operations on restaurant data.
- Handling data transformations and interactions with external systems (if applicable).

### Repository

The Repository layer manages data access to the underlying database. It handles database operations such as Create, Read, Update, and Delete (CRUD) for restaurant data. Additionally, it may include data mapping and conversion between Java objects and database entities.

## Database Design

The project's database design includes tables for College and address management, with fields such as:

## Database Used

The project utilizes the following data structures:

### Model
1.Employee
2.Address

### MySql

The project

 utilizes the `MySql` data structure to store and manage lists of `Employee ` objects in various parts of the application. `MySql` provides permanent storage and efficient element retrieval, making it suitable for storing address and employee records and performing operations on them.

These database enable the application to organize and manipulate Ecommerce  data efficiently while maintaining data integrity.

## Project Summary

The  College Address API Application is a robust Spring Boot application designed for efficient data management. It offers a set of RESTful API endpoints for various College-related operations, including adding, retrieving, updating, and deleting student information.

Key Features:

- RESTful API endpoints for data management.
- Data validation to ensure data integrity.
- Clean code separation with a layered architecture (Controller, Services, Repository).
- Robust error handling for improved reliability.
- Java-based backend and Maven for build management.

The College Address  Management Application serves as a practical example of Spring Boot application development, demonstrating best practices in API design and data management. It offers a solid foundation for building and extending data management systems in various applications.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

## Contact
For questions or feedback, please contact [ROHIT SINGH BISHT](mailto:business.rohitbisht3502@gmail.com)

