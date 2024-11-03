package com.sjsushil09.systems.fooddeliverysystem;

import lombok.Data;

@Data
public class Item implements SearchResult{
    private int id;
    private String name;
    private float price;
}
