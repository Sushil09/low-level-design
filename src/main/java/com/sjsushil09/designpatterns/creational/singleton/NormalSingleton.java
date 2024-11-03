package com.sjsushil09.designpatterns.creational.singleton;

public class NormalSingleton {
    private static NormalSingleton instance = null;

    private NormalSingleton(){}

    public static NormalSingleton getInstance() {
        if(instance == null){
            System.out.println(Thread.currentThread().getName() + " has been allowed");
            instance = new NormalSingleton();

        }
        return instance;
    }
}
