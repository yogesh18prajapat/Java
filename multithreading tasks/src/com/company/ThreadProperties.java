package com.company;

public class ThreadProperties implements  Runnable {
    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+" - Going to sleep");
            Thread.currentThread().join(3000);
            System.out.println(Thread.currentThread().getName()+" - Woke up after 3000 secs");
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadProperties(),"Thread");
        Thread thread = new Thread(new ThreadProperties(),"tttt");

        System.out.println("Starting a Thread");
        t.start();
        System.out.println("State: "+t.getState());
        thread.start();
        try{
            Thread.sleep(10000);
            System.out.println("Woke up after 10 secs");
        }catch (InterruptedException e){
            System.out.println(e);
        }

        try{
            Thread.yield();
            System.out.println("after yield");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
