package com.company;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import  java.util.function.Supplier;

public class Functions {

    public static void main(String[] args) {

        Supplier<Double> x = () -> Math.ceil(Math.sqrt(Math.random()*100));
        for(int i=0;i<10;i++){
            System.out.println(x.get());
        }

        Predicate<Integer> a = num -> num >100;
        System.out.println(a.test(50));

        BiPredicate<Integer,Integer> b = (num1, num2) -> num1>num2;
        System.out.println(b.test(50,100));

        UnaryOperator<Integer> c = (num2) -> num2 + 100;
        System.out.println(c.apply(100));

        BinaryOperator<Integer> d = Integer::sum;
        System.out.println(d.apply(10,20));

        BinaryOperator<Double> e = Double::max;
        System.out.println(e.apply(10.2,10.1));
    }
}
