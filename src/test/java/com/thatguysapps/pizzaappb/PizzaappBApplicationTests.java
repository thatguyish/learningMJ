package com.thatguysapps.pizzaappb;

import com.thatguysapps.pizzaappb.models.Order;
import com.thatguysapps.pizzaappb.repos.OrderRepo;
import org.junit.After;
import org.junit.jupiter.api.*;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;



@SpringBootTest
class PizzaappBApplicationTests {


	@Autowired
	OrderRepo orderRepo;

	Order order;

	@BeforeEach
	void setUp() {
		String[] toppings = {"pepperoni", "sausage", "bacon", "chicken", "mushrooms", "onions", "olives", "pineapple", "peppers", "spinach", "tomatoes"};
		Order newOrder = new Order("joey","thick","medium","Red",toppings);
		order = orderRepo.save(newOrder);
	}

	@Test
	void saveOrder() {
		Assert.assertNotEquals(null,order);
	}

	@Test
	void getAllOrders(){

		List<Order> orders = orderRepo.findAll();

		//orders are not null or empty
		Assert.assertNotEquals(null ,orders);
		Assert.assertNotEquals(0,orderRepo.findAll().size());
	}

	@AfterEach
	void deleteAll() {
		orderRepo.deleteAll();
	}






}
