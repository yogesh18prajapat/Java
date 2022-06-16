package com.company;

import java.util.function.*;

public class Work implements CanSay {
    public void say(String say) {
        System.out.println(say);
    }

    public static void main(String[] args) {
        CanSay cs = new Work();
        cs.say("Message from usingInterface implements CanSay ");
        cs.doIt();

        BinaryOperator<Integer> addition = Integer::sum;
        System.out.println(addition.apply(10,20));

        BinaryOperator<String> subtraction = String::join;
        System.out.println("String: "+subtraction.apply("first Name ","last Name"));

//        String subs = "First Middle Last";
//
//        String a = subs.substring(0,subs.indexOf(" "));
//        String y = subs.substring((subs.indexOf(" ")+1),subs.lastIndexOf(" ") );
//        String z = subs.substring((subs.lastIndexOf(" ")+1));
//        System.out.println("First Name: "+a);
//        System.out.println("Middle Name: "+y);
//        System.out.println("Last Name: "+z);
        BiPredicate<Integer,Integer> isGreater = (x,y) -> x>y;
        System.out.println("isGreater: "+isGreater.test(40,20));


        Consumer<String> c = s -> System.out.println(s.toUpperCase());
        Consumer<String> c1 = s -> System.out.println(s);
//        c.accept("Hello World!");
        c.andThen(c1).accept("Hello World!");


    }

}

//*******************************************
interface Doable {
    default void doIt() {
        System.out.println("Do it now");
    }
}

interface CanSay extends Doable {
    void say(String msg);   // abstract method
}