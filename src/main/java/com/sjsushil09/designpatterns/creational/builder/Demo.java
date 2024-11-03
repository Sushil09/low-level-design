package com.sjsushil09.designpatterns.creational.builder;

public class Demo {
    public static void main(String[] args) {
        Phone iphone = Phone.builder().ram(8)
                .modeName("Iphone 13 pro max")
                .internalStorage(128)
                .operatingSystem("ios 18.1")
                .buildPhone();

        Phone android = Phone.builder().ram(12)
                .modeName("Samsung Galaxy S24 Ultra")
                .internalStorage(256)
//                .operatingSystem("Android 14")
                .buildPhone();

        System.out.println(iphone);
        System.out.println(android);
    }
}
