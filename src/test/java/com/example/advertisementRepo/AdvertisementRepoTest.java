package com.example.advertisementRepo;

import com.example.Model.Advertisement;
import com.example.Model.AdvertisementType;
import com.example.Model.CategoryType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig
@SpringBootTest
class AdvertisementRepoTest {
    public static final String ADS_TITLE = new String(" ");
    public static final Integer ADS_PRICE = 100;
    public static final String ADS_OWNER = new String(" ");
    public static final AdvertisementType ADVERTISEMENT_TYPE = AdvertisementType.MEMBER;
    public static CategoryType CATEGORY_TYPE = CategoryType.GAMING_AND_ENTERTAINMENT;
    public static Date DATE_TEST;
    public static final Long SALES = 500L;
    private Advertisement savedAdvertisement;
    private final Advertisement actual = new Advertisement(ADS_TITLE, ADS_PRICE, ADS_OWNER, ADVERTISEMENT_TYPE, CATEGORY_TYPE, DATE_TEST);

    @Autowired
    AdvertisementRepo sut;
    @Autowired
    UserRepo repo;



    @BeforeEach
    void should_add_a_new_advertisement() {
        System.out.println("Add a new advertisement");
        Advertisement advertisement = new Advertisement("Keyboard", 500, "Webhallen", AdvertisementType.DISCOUNT, CategoryType.COMPUTER_PRODUCTS, new Date(23 - 07 - 17));
        savedAdvertisement = sut.save(advertisement);
    }


    /*@AfterEach
    void should_remove_a_new_advertisement() {
        System.out.println("Remove saved advertisement");
        sut.delete(savedAdvertisement);

    }*/

    @Test
    void should_save_into_database() {
        assertNotNull(savedAdvertisement.getAdsId());
    }

    @Test
    void should_find_advertisement_by_Id() {
        Long adsId = savedAdvertisement.getAdsId();
        Optional<Advertisement> adsById = sut.findById(adsId);
        assertNotNull(adsById.get());
        savedAdvertisement.getAdsId();
        assertEquals(ADS_TITLE, actual.getTitle());
        assertEquals(ADS_PRICE, actual.getPrice());
        assertEquals(ADS_OWNER, actual.getOwner());
        System.out.println(" advertisement Id------> " + adsId);
    }

    @Test
    void getTitle() {
        String title = savedAdvertisement.getTitle();
        System.out.println(" advertisement title------> " + title);

    }

    @Test
    void getPrice() {
        int price = savedAdvertisement.getPrice();
        System.out.println(" advertisement price------> " + price);

    }

    @Test
    void getOwner() {
        String owner = savedAdvertisement.getOwner();
        System.out.println(" advertisement owner------> " + owner);
    }

    @Test
    void getAdvertisementType() {
        AdvertisementType advertisementType = savedAdvertisement.getAdvertisementType();
        System.out.println(" advertisement advertisementType------> " + advertisementType);
    }


    @Test
    void getCategoryType() {
        CategoryType categoryType = savedAdvertisement.getCategoryType();
        System.out.println(" advertisement categoryType------> " + categoryType);
    }

    @Test
    void getExpireDateOffer() {
        Date expireDate = savedAdvertisement.getExpireDateOffer();
        System.out.println(" advertisement expireDate------> " + expireDate);
    }
    @Test
    void canEqual() {

    }

    @Test
    void builder() {
    }
}