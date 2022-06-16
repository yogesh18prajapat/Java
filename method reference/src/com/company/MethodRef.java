package com.company;

import java.util.function.BiFunction;

public class MethodRef {
    public static void main(String[] args) {

//      //Reference to Static Method
        BiFunction<Integer,Integer,Integer> addingInt = Arithmetic::add;
        BiFunction<String,String,String> addingString = Arithmetic::add;
        System.out.println("static method(): "+addingInt.apply(15,20));
        System.out.println("static method(): "+addingString.apply("ha","ha"));

//      //Reference to Instance Method

        //Create an Object of MfUsingInstanceMethods.
        MfUsingInstanceMethods mr = new MfUsingInstanceMethods();
        BiFunction<Integer,Integer,Integer> addInt = mr::add;
        BiFunction<String,String,String> addString = mr::add;
        System.out.println("\ninstance method(): "+addInt.apply(15,20));
        System.out.println("instance method(): "+addString.apply("ha","ha"));

        //Using Anonymous class
        BiFunction<Integer,Integer,Integer> adding = new MfUsingInstanceMethods()::add;
        System.out.println("\nFrom anonymous class: "+adding.apply(10,20));

//      //Reference to Constructor
        Messageable hlo = Message::new;
        hlo.msg();


    }
}

//***************************************
class Arithmetic {
    public static int add(int a, int b){
        return a+b;
    }
    public static String add(String a, String b){
        return a+b;
    }
}

//***************************************
class MfUsingInstanceMethods {
    public  int add(int a, int b){
        return a+b;
    }
    public  String add(String a, String b){
        return a+b;
    }
}
//************************************
class Message{
    Message(){
        System.out.println("\nConstructor: Message from: "+this.getClass().getSimpleName()+" Class");
    }
}
//**************************
interface Messageable{
    public void msg();
}
