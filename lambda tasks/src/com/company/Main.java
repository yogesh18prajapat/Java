package com.company;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main{

    public static void main(String[] args)  {


        Runnable runnable = () -> {
            String myString = "this is a string and we will split it";
            String[] parts = myString.split(" ");
            System.out.println(Arrays.toString(parts));
        };
        runnable.run();

//        System.out.println(everySecondChar("123456789"));

//        Function<String,String> lamb = Main::everySecondChar;
//        System.out.println(lamb.apply("123456789"));

        Supplier<String> iLoveJava = () -> "I Love Java!";
//        Supplier<String> iLoveJava2 = () -> { return "I Love Java!";};
        System.out.println(iLoveJava.get());


    }

    public static String everySecondChar(String source){
        Function<String,String> lam = s ->{
            StringBuilder retVal = new StringBuilder();
            for(int i =0; i< s.length(); i++){
                if(i % 2 ==1){
                    retVal.append(s.charAt(i));
                }
            }

            return ""+retVal;
        };
        return lam.apply(source);
    }

}
