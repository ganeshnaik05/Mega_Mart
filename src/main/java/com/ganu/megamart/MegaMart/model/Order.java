package com.ganu.megamart.MegaMart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Order {

    @Id
    private String orderId;
    private String displayName;
    private String category;
    private String sellerName;
    private double price;
    private int quantity;
    private double totalPrice;
    private Date orderedDate;
    private String orderStatus;

}
