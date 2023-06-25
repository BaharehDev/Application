package com.example.Model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String email;
    private String username;
    private String password;
    private String phone;
    @Enumerated(EnumType.STRING)
    private CategoryType categoryType;

    @Builder
    public Customer(String email, String username, String password, String phone, CategoryType categoryType) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.categoryType = categoryType;
    }
}
