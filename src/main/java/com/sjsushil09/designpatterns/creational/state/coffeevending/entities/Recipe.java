package com.sjsushil09.designpatterns.creational.state.coffeevending.entities;

public class Recipe {
    float milk;
    float sugar;
    float coffeePowder;

    public Recipe(float milk, float sugar, float coffeePowder) {
        this.milk = milk;
        this.sugar = sugar;
        this.coffeePowder = coffeePowder;
    }
}
