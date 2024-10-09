package com.sjsushil09.designpatterns.state.coffeevending.entities;

public class Expresso extends Coffee{
    @Override
    public void setPrice() {
        this.price = 70;
    }

    @Override
    public void setRecipe() {
        this.recipe = new Recipe(10,5,5);
    }
}
