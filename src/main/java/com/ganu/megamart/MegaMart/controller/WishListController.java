package com.ganu.megamart.MegaMart.controller;

import com.ganu.megamart.MegaMart.model.WishList;
import com.ganu.megamart.MegaMart.service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wishlist")
public class WishListController {

    @Autowired
    private WishListService wishlistService;

    @PostMapping("/add")
    public WishList addToWishlist(@RequestBody WishList wishlist) {
        return wishlistService.addToWishlist(wishlist);
    }

}
