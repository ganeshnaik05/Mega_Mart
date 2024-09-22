package com.ganu.megamart.MegaMart.service;

import com.ganu.megamart.MegaMart.model.Cart;
import com.ganu.megamart.MegaMart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Cart addToCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Cart getCart(String cartId) {
        return cartRepository.findById(cartId).orElse(null);
    }

}
