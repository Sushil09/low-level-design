package com.sjsushil09.systems.fooddeliverysystem;

import java.util.List;

public class OrderService {
    private List<Order> orders;
    private Notification notification;

    //CRUD operations on Orders

    public int placeOrder(Order order) {
        System.out.println("Order has been placed, id "+ order.getId());

        order.setStatus(OrderStatus.PLACED);
        notification.notify(order);
        return order.getId();
    }

    public void cancelOrder(Order order) {
        System.out.println("Order has been cancelled, id "+ order.getId());
        order.setStatus(OrderStatus.CANCELLED);
        notification.notify(order);
    }
}
