package com.sjsushil09.designpatterns.creational.state;

interface FanState{
    public void turnDown(FanContext fanContext);
    public void turnUp(FanContext fanContext);
}

class IdleState implements FanState {

    @Override
    public void turnDown(FanContext fanContext) {
        System.out.println("Fan is already off");
    }

    @Override
    public void turnUp(FanContext fanContext) {
        System.out.println("Turning on at low speed");
        fanContext.setFanState(new DecreaseSpeed());
    }
}

class IncreaseSpeed implements FanState {

    @Override
    public void turnDown(FanContext fanContext) {
        System.out.println("Lowering speed of fan");
        fanContext.setFanState(new DecreaseSpeed());
    }

    @Override
    public void turnUp(FanContext fanContext) {
        System.out.println("Increasing the speed");
        fanContext.setFanState(new IncreaseSpeed());
    }
}

class DecreaseSpeed implements FanState {

    @Override
    public void turnDown(FanContext fanContext) {
        System.out.println("Switching off the fan");
        fanContext.setFanState(new IdleState());
    }

    @Override
    public void turnUp(FanContext fanContext) {
        System.out.println("Increase speed of fan");
        fanContext.setFanState(new IncreaseSpeed());
    }
}



class FanContext {
    private FanState fanState;

    FanContext() {
        fanState = new IdleState();
    }

    public void setFanState(FanState state) {
        this.fanState = state;
    }

    public void turnUp() {
        fanState.turnUp(this);
    }

    public void turnDown() {
        fanState.turnDown(this);
    }

}

public class Main {
    public static void main(String[] args) {
        FanContext fan = new FanContext(); //Idle state

        fan.turnUp();
        fan.turnDown();
        fan.turnDown();



    }
}