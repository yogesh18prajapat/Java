package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        new Thread(() -> {
//            System.out.println("first statement: " + System.currentTimeMillis());
//            System.out.println("second statement: " + System.currentTimeMillis());
//            System.out.println("Third statement: " + System.currentTimeMillis());
//        }).start();

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "batman", "superMan", "flash", "cyborg");

// Concat using anonymous class.
//        String string = upperConcat(new Concat() {
//            @Override
//            public String UpConcat(String s1, String s2) {
//                return s1.toUpperCase() +" "+ s2.toUpperCase();
//            }
//        },
//                list.get(0), list.get(1) );
//        System.out.println(string);

// Concat using Lambda expressions.
        Concat uc = (s1, s2) -> s1.toUpperCase() + " " + s2.toUpperCase();
//        Concat uc = (String s1, String s2) -> s1.toUpperCase() + " "+ s2.toUpperCase();
        String output = upperConcat(uc, list.get(0), list.get(1));
        System.out.println(output);

        AnotherClass ac = new AnotherClass();
        ac.doSomething();


    }

    public static String upperConcat(Concat c, String s1, String s2) {
        return c.UpConcat(s1, s2);
    }

}

interface Concat {
    public String UpConcat(String s1, String s2);
//    public String downConcat(String s1, String s2);

}

class AnotherClass {

    public String doSomething() {
        System.out.println("doSomething class's name is: " + getClass().getSimpleName());
        return Main.upperConcat(new Concat() {
                                    @Override
                                    public String UpConcat(String s1, String s2) {
                                        System.out.println("AnotherClass class's name is: " + getClass().getSimpleName());
                                        return s1.toUpperCase() + " " + s2.toUpperCase();
                                    }
                                },
                "String1", "String2");

//        System.out.println("AnotherClass class's name is: "+getClass().getSimpleName());
//
//    Concat c = (s1,s2)->{
//        System.out.println("Interface's  class name is: "+getClass().getSimpleName());
//        String x = s1.toUpperCase()+" "+s2.toUpperCase();
//        return x;
//    };
//        return Main.upperConcat(c,"String!","String2");
//
//            }


    }
}

