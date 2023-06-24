package com.example.controller;

import com.example.Model.UserObj;
import com.example.advertisementRepo.UserRepo;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserRepo userRepo;

    public UserController(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") UserObj userObj){
        userRepo.save(userObj);
        return "user";
    }
}
