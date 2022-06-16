package com.company;

import java.util.function.*;

public class UsingInterface {


    public static void main(String[] args) {


        BiFunction<Integer, Integer, Integer> adding = DoOperation::add;
        BiFunction<Integer, Integer, Integer> subtracting = DoOperation::subtract;
        BiFunction<Integer, Integer, Integer> multiplying = DoOperation::multiply;
        System.out.println(adding.apply(100, 50));
        System.out.println(subtracting.apply(100, 50));
        System.out.println(multiplying.apply(100, 50));

        Addition addInt = new DoAddition()::add;
        System.out.println(addInt.add(45, 55));


    }

}

//*************************************
interface Addition {
    int add(int a, int b);

    int a = 0;
    String name = "My name is Addition and I belong to Interface";
}

//********************
class DoAddition {
    public int add(int a, int b) {
        return a + b;
    }
}

//***************************************
class DoOperation {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}



