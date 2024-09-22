package com.ganu.megamart.MegaMart.controller;

import com.ganu.megamart.MegaMart.model.Cart;
import com.ganu.megamart.MegaMart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public Cart addToCart(@RequestBody Cart cart) {
        return cartService.addToCart(cart);
    }

    @GetMapping("/{cartId}")
    public Cart getCart(@PathVariable String cartId) {
        return cartService.getCart(cartId);
    }

}
