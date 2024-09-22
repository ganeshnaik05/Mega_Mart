package com.ganu.megamart.MegaMart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {

    @Id
    private String productId;
    private String productName;
    private String description;
    private double price;
    private double discount;
    private double deliveryCharges;
    private int avgRating;
    private String sellerName;

}
