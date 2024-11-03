package com.sjsushil09.designpatterns.creational.factory;

public class Demo {
    public static void main(String[] args) {
        Area squareArea = ShapeFactory.calcAre(SHAPES.SQUARE, 5);
        Area rectangleArea = ShapeFactory.calcAre(SHAPES.RECTANGLE, 5, 2);
        Area circle = ShapeFactory.calcAre(SHAPES.CIRCLE, 4);

        System.out.println(squareArea.calculateArea());
        System.out.println(rectangleArea.calculateArea());
        System.out.println(circle.calculateArea());
    }
}
