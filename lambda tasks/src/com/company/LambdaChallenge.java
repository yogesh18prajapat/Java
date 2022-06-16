package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaChallenge {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("itachi","eren","zeke","armin","zoro","luffy");
//        Function<List<String>,List<String>> lam = LambdaChallenge::firstUpper;
////        List<String> result = lam.apply(names);
////        result.forEach(System.out::println);
//        lam.apply(names).forEach(System.out::println);

//
//        names.stream()
//                .sorted(String::compareTo)
//                .map(s ->
//                     s.substring(0,1).toUpperCase()+s.substring(1)
//                )
//                .forEach(System.out::println);

       long namesStartWith_A = names.stream()
                .map(s -> s.substring(0,1).toUpperCase()+s.substring(1))
                .sorted(String::compareTo)
                .peek(System.out::println)
                .filter(s -> s.startsWith("A"))
                .count();


        System.out.println("number of names start with 'A' : "+namesStartWith_A);



    }

    public static List<String> firstUpper(List<String> list){
        List<String> upper = new ArrayList<>();
        list.forEach(string -> {
            upper.add(string.substring(0,1).toUpperCase()+string.substring(1));
        });
        upper.sort(String::compareTo);
       return upper;

    }
}
