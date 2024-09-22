package com.sjsushil09.designpatterns.singleton;

public class SynchronizedMethodBlock {
    private static SynchronizedMethodBlock synchronizedMethodBlock = null;

    private SynchronizedMethodBlock(){}

    public static synchronized SynchronizedMethodBlock getInstance() {
        if(synchronizedMethodBlock == null){
            System.out.println(Thread.currentThread().getName() + " has been allowed");
            synchronizedMethodBlock = new SynchronizedMethodBlock();

        }

        return synchronizedMethodBlock;
    }
}
