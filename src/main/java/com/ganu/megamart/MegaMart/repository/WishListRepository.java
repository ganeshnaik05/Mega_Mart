package com.ganu.megamart.MegaMart.repository;

import com.ganu.megamart.MegaMart.model.Account;
import com.ganu.megamart.MegaMart.model.WishList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishListRepository extends JpaRepository<WishList,String> {
}
