package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Thread thread1 = new Thread(new MyClass(),"Thread1");
        Thread thread2 = new Thread(new MyClass(),"Thread2");
        Thread thread3 = new Thread(new MyClass(),"Thread3");
        Thread thread4 = new Thread(new MyClass(),"Thread4");
        thread1.start();
        thread2.start();
        thread3.start();
//        thread4.start();

//          Thread t = new Thread(new ThreadYield(),"t1");
//          t.start();
//          Thread t1 = new Thread(new ThreadYield(),"t2");
//          t1.start();

//        Thread thread = Thread.currentThread();
//        System.out.println(thread.getName());
//        thread.setName("My main Method");
//        System.out.println(thread.getName());


        Thread t = new Thread(new ThreadYield());
        t.start();



    }

}
