package com.sjsushil09.systems.fooddeliverysystem;

import lombok.Data;

import java.util.List;

@Data
public class Restaurant implements SearchResult{

    private int id;
    private String name;
    private String address;
    private List<Item> items;
}
