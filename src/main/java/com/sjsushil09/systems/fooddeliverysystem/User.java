package com.sjsushil09.systems.fooddeliverysystem;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private int id;
    private String name;
    private String email;
    private String password;

    private List<Order> orderList;
    private Cart cart;

}
