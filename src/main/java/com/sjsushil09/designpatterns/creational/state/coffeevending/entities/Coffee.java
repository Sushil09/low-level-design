package com.sjsushil09.designpatterns.creational.state.coffeevending.entities;

public abstract class Coffee {
    float price;
    Recipe recipe;

    public float getPrice() {
        return this.price;
    }

    public Recipe getRecipe() {
        return this.recipe;
    }
    public abstract void setPrice();
    public abstract void setRecipe();
}
