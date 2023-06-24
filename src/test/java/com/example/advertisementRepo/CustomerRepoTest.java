package com.example.advertisementRepo;

import com.example.Model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerRepoTest {

    public static final Long NOY_VALID_ID = -1000l;
    @Autowired
    UserRepo sut;

    @Test
    void name() {

        Optional<Customer> optionalUser = sut.findById(NOY_VALID_ID);
        assertFalse(optionalUser.isPresent());

    }
}