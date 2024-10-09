package com.sjsushil09.designpatterns.state.coffeevending;

import com.sjsushil09.designpatterns.state.coffeevending.entities.Cappuccino;
import com.sjsushil09.designpatterns.state.coffeevending.entities.Coffee;
import com.sjsushil09.designpatterns.state.coffeevending.entities.Expresso;

public class Driver {
    public static void main(String[] args) {
        Expresso espresso = new Expresso();
        Cappuccino cappuccino = new Cappuccino();

        System.out.println(espresso.getPrice());
        System.out.println(cappuccino.getPrice());
    }
}
