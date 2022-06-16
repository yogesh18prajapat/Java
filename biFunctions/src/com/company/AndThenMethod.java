package com.company;

import java.util.function.BiFunction;
import java.util.function.Function;

public class AndThenMethod {

    public static void andThenMethod(){

        BiFunction<Integer,Integer,Integer> multiply = (a, b) -> a*b;
        Function<Integer,String> divide = (x) -> ""+x/5;
        System.out.println("andThen(): "+multiply.andThen(divide).apply(10,10));
        //In above code divide function takes multiply biFunction's return value as it's input parameter.
        //here, a*b is input for divide function
        //It performs first method then it goes to andThen method.
    }
}
