package com.example.advertisementRepo;

import com.example.Model.Advertisement;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertisementRepo extends CrudRepository<Advertisement, Long> {

 /*   @Query("SELECT a FROM Advertisement a ORDER BY a.sales DESC")
    List<Advertisement> findMostSoldProducts();*/


}
