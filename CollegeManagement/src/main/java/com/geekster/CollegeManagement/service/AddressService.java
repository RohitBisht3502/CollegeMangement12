package com.geekster.CollegeManagement.service;

import com.geekster.CollegeManagement.model.Address;
import com.geekster.CollegeManagement.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return "address added";
    }

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public String deleteAddressById(Long id) {
        Optional<Address> optionalAddress=addressRepo.findById(id);
        if(optionalAddress.isPresent()){
            addressRepo.deleteById(id);
            return "deleted";
        }else return "id not found";

    }
}
