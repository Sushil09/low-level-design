package com.sjsushil09.designpatterns.state.coffeevending.entities;

public class Cappuccino extends Coffee{
    @Override
    public void setPrice() {
        this.price = 90;
    }

    @Override
    public void setRecipe() {
        this.recipe = new Recipe(15,2,7);
    }
}
