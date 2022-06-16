package com.company;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args){

        Sayable sayable = Main::saying;
        sayable.say();

        Thread t = new Thread(ThreadExample::thread);
        t.start();

        //Method reference, Calling static add method using its class Adding;
        BiFunction<Integer,Integer,Integer> adding = Addinig::add;
        System.out.println(adding.apply(10,25));




    }
    public static void saying(){
        System.out.println("From static method saying() ");
    }

}
//*************************************
interface Sayable{
    void say();
}
//*************************************
class ThreadExample{
     static void thread(){
        System.out.println("Running from ThreadExample");
    }
}
//*************************************
class Addinig{
    public static int add(int a, int b){
        return  (a+b);
    }
}