package com.geekster.CollegeManagement.service;

import com.geekster.CollegeManagement.model.Laptop;
import com.geekster.CollegeManagement.repo.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo laptopRepo;

    public String addLaptop(Laptop newLaptop) {
        laptopRepo.save(newLaptop);
        return "added";
    }

    public List<Laptop> getAllLaptop() {
        return laptopRepo.findAll();
    }

    public String deleteLaptopById(Long id) {
        laptopRepo.deleteById(id);
        return "delete";
    }
}
