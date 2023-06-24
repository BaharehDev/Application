package com.example.controller;

import com.example.Model.Advertisement;
import com.example.Service.AdvertisementService;
import com.example.exception.NotFoundAdvertisementException;
import com.example.exception.NotSavedAdvertisementException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ads")
public class AdsController {

    private final AdvertisementService advertisementService;

    public AdsController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    //Model is an inbuilt interface
    /*@PostMapping("/create")
    public String createAdvertisement(Model model, Errors errors){
    model.addAttribute("advertisement", new Advertisement());
    if (errors.hasErrors())
        return "createAdvertisement";
    }*/
    @GetMapping("/all")
    public List<Advertisement> advertisementList() throws NotFoundAdvertisementException {
        return advertisementService.findAllAdvertisements();
    }

    @PostMapping("/save")
    public Advertisement saveAdvertisement(@RequestBody Advertisement advertisement) throws NotSavedAdvertisementException {
        return advertisementService.saveAdvertisement();

    }



    /*@GetMapping("/most_sold")
    public List<Advertisement> mostSoldProducts(@DefaultValue("sales") Long sales){
        return advertisementService.getMostSoldProducts();
    }*/

}
