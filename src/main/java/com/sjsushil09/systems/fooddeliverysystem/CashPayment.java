package com.sjsushil09.systems.fooddeliverysystem;

public class CashPayment implements Payment{
    @Override
    public boolean pay(float amount) {
        System.out.println("Thank you for the payment via Cash");
        return true;
    }
}
