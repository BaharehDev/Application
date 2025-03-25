package com.example.Service;

import com.example.Model.Advertisement;
import com.example.advertisementRepo.AdvertisementRepo;
import com.example.exception.NotFoundAdvertisementException;
import com.example.exception.NotSavedAdvertisementException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class AdvertisementService {

    /*The @Autowired annotation in Spring is used to automatically wire (inject) dependencies into a class.
    It can be applied to fields, constructors, or setter methods to indicate that Spring should resolve and provide the required dependency automatically.*/
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


    public Advertisement saveAdvertisement(Advertisement newAds) throws NotSavedAdvertisementException {
        Advertisement advertisement = dao.save(newAds);
        if (advertisement.equals(newAds)){
            return advertisement;
        }
        throw new NotSavedAdvertisementException(String.format("There is not advertisement with id = %s" + advertisement.getAdsId()));
    }

    public Advertisement findAdsById(Long id){
        Optional<Advertisement> foundAdsId = dao.findById(id);
        if (foundAdsId.isPresent()) {
            log.info("customer by id={}", id);
            return foundAdsId.get();
        }else {
            log.info("not found advertisement by id={}", id);
            return null;
        }
    }

   /* public List<Advertisement> getMostSoldProducts() {
        return dao.findMostSoldProducts();
    }*/
}