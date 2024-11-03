package com.sjsushil09.designpatterns.creational.factory;

public class ShapeFactory {
   public static Area calcAre(SHAPES shape, int...sides) {
       return switch (shape) {
           case CIRCLE -> new Circle(sides[0]);
           case RECTANGLE -> new Rectangle(sides[0],sides[1]);
           case SQUARE -> new Square(sides[0]);
       };
   }
}
