package com.company;

import java.util.concurrent.TimeUnit;

public class MyClass implements Runnable {

    @Override
    public void run() {
        for(int i =0; i<5;i++){
            System.out.println("Number "+i+" : "+Thread.currentThread().getName());
        }


//        long curTime = System.currentTimeMillis();
//
//        try {
//            System.out.println("Time: "+0);
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Sleep Ttime: "+(System.currentTimeMillis()-curTime));
//        try {
//            m1();
//        }catch (InterruptedException x){
//            System.out.println(x);
//        }
    }

    public void m1() throws InterruptedException {
        //TimeUnit is an Enum from java.util.concurrent.TimeUnit class.
        TimeUnit.SECONDS.sleep(5);
        System.out.println("woke after 5 secs");
    }

}
