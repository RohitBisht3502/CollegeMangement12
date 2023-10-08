package com.geekster.CollegeManagement.repo;

import com.geekster.CollegeManagement.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Long> {
}
