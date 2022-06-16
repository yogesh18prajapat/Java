package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Normal {
    public static void main(String[] args) {

       List<String> numbers = Arrays.asList(
                "A15", "A58",
                "Z18", "Z87",
                "H45", "H87", "H12", "h72",
                "C14", "C52",
                "E15", "E01", "E94", "E65");

        List<String> sNum = new ArrayList<>();

        numbers.forEach(num -> {
            if (num.toUpperCase().startsWith("H")) {
                sNum.add(num);
            }
        });

//      sNum.sort((x,y)-> x.compareTo(y));
//      sNum.forEach(x-> System.out.println(x));
        sNum.sort(String::compareTo);
        sNum.forEach(System.out::println);

    }

}
