package com.thatguysapps.pizzaappb.repos;

import com.thatguysapps.pizzaappb.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends MongoRepository<Order, String> {
    public Order findById(Integer Id);
    public List<Order> findByCustomerName(String customerName);
}
