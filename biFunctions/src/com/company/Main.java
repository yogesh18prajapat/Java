package com.company;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        BfMap.maps();
        AndThenMethod.andThenMethod();

      //Function,[ Function<Input Type, Output Type> ].
        Function<Integer,Boolean> isEven = (x) -> (x%2 == 0) ;
        boolean result = isEven.apply(44);
        System.out.println("Function Ans: "+result);

      //BiFunction, [ Function<Input Type, Input type, Output Type> ].
        BiFunction<Integer,Integer,Integer> multiply = (x,y) -> x*y;
        int output = multiply.apply(12,95);
        System.out.println("BiFunction Ans: "+output);

      //Using AndThen() method.
        System.out.println("andThen(): "+multiply.andThen(isEven).apply(11,91));
    }
}