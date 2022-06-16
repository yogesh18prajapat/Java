package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        StringObjects string = new StringObjects();
        Object[] result = string.getArray();
        System.out.println(Arrays.toString(result));
//        System.out.println("array of string Objects");
//        for(Object i : result){
//            System.out.println(i);
//        }

    }
}
