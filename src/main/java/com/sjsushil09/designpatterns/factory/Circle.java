package com.sjsushil09.designpatterns.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Circle implements Area {

    private int radius;

    @Override
    public double calculatArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }
}
