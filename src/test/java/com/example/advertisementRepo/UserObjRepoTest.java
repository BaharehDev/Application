package com.example.advertisementRepo;

import com.example.Model.UserObj;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserObjRepoTest {

    public static final Long NOY_VALID_ID = -1000l;
    @Autowired
    UserRepo sut;

    @Test
    void name() {

        Optional<UserObj> optionalUser = sut.findById(NOY_VALID_ID);
        assertFalse(optionalUser.isPresent());

    }
}