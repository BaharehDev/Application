package com.example.advertisementRepo;

import com.example.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

    Optional<Customer> findByUserId(int id);

}
