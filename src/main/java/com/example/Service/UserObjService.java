package com.example.Service;

import com.example.Model.Customer;
import com.example.advertisementRepo.CustomerRepo;
import com.example.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserObjService {

    @Autowired
    private CustomerRepo repo;


    public Customer getUserById(int id) {
        return repo.findByUserId(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(String.format("User with id %d Not found" + id))
                );

    }
}
