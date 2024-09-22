package com.ganu.megamart.MegaMart.repository;

import com.ganu.megamart.MegaMart.model.Account;
import com.ganu.megamart.MegaMart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,String> {
    List<Product> findByProductNameStartingWith(String name);
}
