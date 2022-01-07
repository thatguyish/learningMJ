package com.thatguysapps.pizzaappb.service;

import com.thatguysapps.pizzaappb.models.Order;
import com.thatguysapps.pizzaappb.repos.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public void save(Order order) {
        orderRepo.save(order);
    }

    public Iterable<Order> findAll() {
        return orderRepo.findAll();
    }

}
