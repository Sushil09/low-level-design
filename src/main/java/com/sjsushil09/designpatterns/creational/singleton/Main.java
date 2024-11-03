package com.sjsushil09.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {

//        NormalSingleton normalSingleton1 = NormalSingleton.getInstance();
//        NormalSingleton normalSingleton2 = NormalSingleton.getInstance();
//        System.out.println(normalSingleton1 == normalSingleton2);
//        System.out.println(normalSingleton1);

        Thread t1 = new Thread(()->{
            System.out.println("the thread name is "+ Thread.currentThread().getName());
            NormalSingleton normalSingleton1 = NormalSingleton.getInstance();
            System.out.println(normalSingleton1);
        });
        Thread t2 = new Thread(()->{
            System.out.println("the thread name is "+ Thread.currentThread().getName());
            NormalSingleton normalSingleton2 = NormalSingleton.getInstance();
            System.out.println(normalSingleton2);
        });

        t1.start();
        t2.start();

        //Using Synchronized block

        Thread t3 = new Thread(()->{
            System.out.println("the thread name is "+ Thread.currentThread().getName());
            SynchronizedMethodBlock synchronizedMethodBlock1 = SynchronizedMethodBlock.getInstance();
            System.out.println(synchronizedMethodBlock1);
        });
        Thread t4 = new Thread(()->{
            System.out.println("the thread name is "+ Thread.currentThread().getName());
            SynchronizedMethodBlock synchronizedMethodBlock2 = SynchronizedMethodBlock.getInstance();
            System.out.println(synchronizedMethodBlock2);
        });

        t3.start();
        t4.start();

        //Double Locking 



    }
}
