package com.example.Service;

import com.example.Model.UserObj;
import com.example.advertisementRepo.UserRepo;
import com.example.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserObjService {

    @Autowired
    private UserRepo repo;


    public UserObj getUserById(Long id) {
        return repo.findByUserId(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(String.format("User with id %d Not found" + id))
                );

    }
}
