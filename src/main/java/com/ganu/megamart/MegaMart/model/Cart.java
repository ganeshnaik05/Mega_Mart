package com.ganu.megamart.MegaMart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cart {

    @Id
    private String cartId;
    private String productName;
    private String sellerName;
    private int quantity;
    private double cartOfferPrice;

}
