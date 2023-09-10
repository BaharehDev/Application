package com.example.controller;

import com.example.Model.Customer;
import com.example.advertisementRepo.CustomerRepo;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private CustomerRepo customerRepo;

    public UserController(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }


}
