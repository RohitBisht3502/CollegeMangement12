package com.geekster.CollegeManagement.controller;

import com.geekster.CollegeManagement.model.Laptop;
import com.geekster.CollegeManagement.service.CourseService;
import com.geekster.CollegeManagement.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;

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
}
