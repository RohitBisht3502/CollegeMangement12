package com.geekster.CollegeManagement.controller;

import com.geekster.CollegeManagement.model.Address;
import com.geekster.CollegeManagement.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

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



}
