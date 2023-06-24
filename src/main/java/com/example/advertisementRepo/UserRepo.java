package com.example.advertisementRepo;

import com.example.Model.UserObj;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<UserObj, Long> {

    Optional<UserObj> findByUserId(Long id);
}
