package com.company;

public class MTT implements Runnable {

    public void run(){
        System.out.println("Java is 'Hot' :) "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new MTT(),"thread1");
        t1.start();
        Thread t2 = new Thread(new MTT(),"thread2");
        t2.start();
    }
}
