package com.example;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
@Builder
@Data
public class AdvertisementApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdvertisementApplication.class, args);
    }

}
