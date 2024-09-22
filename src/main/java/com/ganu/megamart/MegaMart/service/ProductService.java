package com.ganu.megamart.MegaMart.service;

import com.ganu.megamart.MegaMart.model.Product;
import com.ganu.megamart.MegaMart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> searchProducts(String name) {
        return productRepository.findByProductNameStartingWith(name);
    }

}
