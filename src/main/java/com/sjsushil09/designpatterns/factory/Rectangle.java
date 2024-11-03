package com.sjsushil09.designpatterns.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter@Getter
public class Rectangle implements Area{

    private int length,breadth;
    @Override
    public double calculatArea() {
        return this.getLength() * this.getBreadth();
    }
}
