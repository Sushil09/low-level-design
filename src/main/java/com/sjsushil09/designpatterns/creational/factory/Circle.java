package com.sjsushil09.designpatterns.creational.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Circle implements Area {

    private int radius;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }
}
