package com.thatguysapps.pizzaappb.models;

public class Order {


    public String id;
    public String customerName;
    public String crustType;
    public String size;
    public String sauce;
    public String[] toppings;

    public Order() {
    }

    public Order(String customerName, String crustType, String size, String sauce, String[] toppings) {
        this.customerName = customerName;
        this.crustType = crustType;
        this.size = size;
        this.sauce = sauce;
        this.toppings = toppings;
    }
}
