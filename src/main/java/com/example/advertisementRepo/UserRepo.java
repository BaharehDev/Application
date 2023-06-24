package com.example.advertisementRepo;

import com.example.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<Customer, Long> {

    Optional<Customer> findByUserId(Long id);
}
