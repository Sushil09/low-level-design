package com.sjsushil09.systems.fooddeliverysystem;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private int id;
    private OrderStatus status ;
    private User user;

    private Notification notification;

    private Payment payment;

    private List<Item> items;


}
