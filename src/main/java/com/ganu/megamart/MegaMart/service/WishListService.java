package com.ganu.megamart.MegaMart.service;

import com.ganu.megamart.MegaMart.model.WishList;
import com.ganu.megamart.MegaMart.repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishListService {

    @Autowired
    private WishListRepository wishlistRepository;

    public WishList addToWishlist(WishList wishlist) {
        return wishlistRepository.save(wishlist);
    }

}
