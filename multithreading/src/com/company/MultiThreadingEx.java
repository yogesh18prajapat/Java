package com.company;


import java.util.concurrent.TimeUnit;

public class MultiThreadingEx implements Runnable{
    @Override
    public void run() {
        System.out.println("MultithreadingEx class run() method");

        try {
            m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Thread x = new Thread(new MultiThreadingEx());
        x.setPriority(Thread.MIN_PRIORITY);
        x.start();
        System.out.println("main class");
    }

    public void m1() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        System.out.println("woke");
    }



}
