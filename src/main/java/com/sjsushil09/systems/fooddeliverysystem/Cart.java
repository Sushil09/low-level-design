package com.sjsushil09.systems.fooddeliverysystem;

import lombok.Data;

import java.util.List;

@Data
public class Cart {
    private List<Item> items;

    private OrderService orderService;

    public int placeOrder() {
//        Order order = Order.OrderBuilder.

//        return orderService.placeOrder();

        return -1;
    }

}
