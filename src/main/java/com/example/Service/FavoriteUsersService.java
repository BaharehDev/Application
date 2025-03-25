package com.example.Service;


import java.util.ArrayList;
import java.util.List;

public class FavoriteUsersService {
    private List<Product> favoriteList = new ArrayList<>();
    public void addToFavorites(Product product){
        this.favoriteList.add(product);
    }
}
