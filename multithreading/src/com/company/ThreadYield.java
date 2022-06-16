package com.company;

public class ThreadYield extends Thread{

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("ThreadYield class run() is running for thread: " + t.getName());
        int i = 0;
        while (i < 10) {
            System.out.println(t.getName() + ":- " + i);
            if (i == 5) {
                Thread.yield();
            }
            i++;
        }
    }
}
