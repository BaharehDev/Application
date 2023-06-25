package com.example.advertisementRepo;

import com.example.Model.CategoryType;
import com.example.Model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerRepoTest {

    public static final Long NOT_VALID_ID = -1000l;

    @Autowired
    CustomerRepo sut;


    //save
    @Test
    void should_save_a_new_customer_in_database() {
        Customer customer = Customer.builder()
                .email("test@test.com")
                .categoryType(CategoryType.BEAUTY_AND_HEALTH)
                .build();

        Customer actualCustomer = sut.save(customer);
        assertEquals("test@test.com", actualCustomer.getEmail());
    }

    //find
    @Test
    void should_find_an_existed_customer() {
        Optional<Customer> customerOptional = sut.findById(10);
        assertTrue(customerOptional.isPresent());
        Customer customer = customerOptional.get();
        assertEquals("example@gmail.com", customer.getEmail());
        assertEquals("aaaa", customer.getPassword());

    }
}

//Update

//delete
