package com.thatguysapps.pizzaappb.controllers;

import com.thatguysapps.pizzaappb.models.Order;
import com.thatguysapps.pizzaappb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public void createOrder(@RequestBody Order order) {
        orderService.save(order);
    }

    @GetMapping("/getall")
    public Iterable<Order> getAllOrders() {
        return orderService.findAll();
    }
}