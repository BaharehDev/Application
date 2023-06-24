package com.example.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Advertisement {

//Ads type: veckans erbjudande, mother/father day, student vecka....

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adsId;
    private String title;
    private Integer price;
    private String owner;
    //private Date createAt = new Date();
    @Enumerated(EnumType.STRING)
    private AdvertisementType advertisementType;
    @Enumerated(EnumType.STRING)
    private CategoryType categoryType;
    @Temporal(TemporalType.DATE)
    private Date expireDateOffer;
/*    @Column(name = "sales")
    private Long sales;*/

    public Advertisement(String title, Integer price, String owner, AdvertisementType advertisementType, CategoryType categoryType, Date expireDateOffer) {
        this.title = title;
        this.price = price;
        this.owner = owner;
        this.advertisementType = advertisementType;
        this.categoryType = categoryType;
        this.expireDateOffer = expireDateOffer;

    }

/*   @OneToOne
    private Product products;*/
}
