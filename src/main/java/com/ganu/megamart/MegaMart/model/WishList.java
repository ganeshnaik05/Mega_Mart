package com.ganu.megamart.MegaMart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class WishList {

    @Id
    private String wishId;
    private String displayName;
    private String shortDesc;
    private String category;

}
