package com.example.Service;

import com.example.Model.Advertisement;
import com.example.advertisementRepo.AdvertisementRepo;
import com.example.exception.NotFoundAdvertisementException;
import com.example.exception.NotSavedAdvertisementException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AdvertisementService {

    @Autowired
    private AdvertisementRepo dao;

    public AdvertisementService(AdvertisementRepo dao) {
        this.dao = dao;
    }

    public List<Advertisement> findAllAdvertisements() throws NotFoundAdvertisementException {
        List<Advertisement> allAdvertisements = (List<Advertisement>) dao.findAll();

        if (allAdvertisements.isEmpty()) {
            throw new NotFoundAdvertisementException("No advertisement find");
        } else {
            return allAdvertisements;
        }
    }

    public Advertisement saveAdvertisement() throws NotSavedAdvertisementException {
        Advertisement advertisement = dao.save(new Advertisement());
        Long adsId = advertisement.getAdsId();

        return advertisement;
    }


   /* public List<Advertisement> getMostSoldProducts() {
        return dao.findMostSoldProducts();
    }*/
}