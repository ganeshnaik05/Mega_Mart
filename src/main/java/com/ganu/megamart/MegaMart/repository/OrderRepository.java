package com.ganu.megamart.MegaMart.repository;

import com.ganu.megamart.MegaMart.model.Account;
import com.ganu.megamart.MegaMart.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,String> {
}
