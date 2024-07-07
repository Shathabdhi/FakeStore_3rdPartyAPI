package com.API.designing.project.API.project.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakestoreProductResponseDTO {
    /*
    * Schema change is the biggest pain
    * we can return the product entity as well but to avoid the risk of FS main website itself
    changed its schema then we can not change our entity structure.
    * So We create FakestoreProductResponseDTO
    * Make sure attribute name matches with the json name
    * rating is an object so have to create a new class
     */

    private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private FakeStoreRatingDTO rating;


}
