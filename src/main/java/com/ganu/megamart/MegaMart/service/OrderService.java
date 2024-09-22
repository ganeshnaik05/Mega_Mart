package com.ganu.megamart.MegaMart.service;

import com.ganu.megamart.MegaMart.model.Order;
import com.ganu.megamart.MegaMart.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order placeOrder(Order order) {
        return orderRepository.save(order);
    }

}
