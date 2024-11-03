package com.sjsushil09.designpatterns.creational.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Square implements Area{

    private int side;
    @Override
    public double calculateArea() {
        return Math.pow(this.getSide(),2);
    }
}
