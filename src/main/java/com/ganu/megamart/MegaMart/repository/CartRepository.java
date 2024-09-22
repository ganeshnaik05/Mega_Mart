package com.ganu.megamart.MegaMart.repository;

import com.ganu.megamart.MegaMart.model.Account;
import com.ganu.megamart.MegaMart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,String> {
}
