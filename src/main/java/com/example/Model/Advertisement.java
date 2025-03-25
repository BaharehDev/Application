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
    private DiscountType discountType;
    @Enumerated(EnumType.STRING)
    private CategoryType categoryType;
    @Temporal(TemporalType.DATE)
    private Date expireDateOffer;
/*    @Column(name = "sales")
    private Long sales;*/


/*   @OneToOne
    private Product products;*/
}