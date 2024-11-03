package com.sjsushil09.systems.fooddeliverysystem;

public class OnlinePayment implements Payment{
    @Override
    public boolean pay(float amount) {
        System.out.println("Thank you for the payment via Online method");
        return true;
    }
}
