package com.ganu.megamart.MegaMart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Account {

    @Id
    private String name;
    private String password;
    private String email;

    public String getConfirmPassword() {
        return "Success";
    }
}
