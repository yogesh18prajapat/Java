package com.company;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        String y = "once there was a lion ";
        firstCapitalLetter(y);
        reverseEachWord(y);
        toggleEachWord(y);


        String str1 = "String";
        String str2 = new String("String");

        System.out.println("equals(): "+str1.equals(str2));
        System.out.println(str1 == str2);


        int[] stringArray = new int[10];
//        stringArray[5] = "got u homie";
        System.out.println(Arrays.toString(stringArray));

//        System.out.println(Pattern.matches("...\\d","abc0" ));
//
//        String s1 = "ne4$wS9768$4760@@@$@!!!##$$%^^^&hmki$gijh5$4,6586$8ghgh44hnght$5r5n9g";
//        System.out.println(s1);
//        String s2 = s1.replaceAll("\\w","");
//        System.out.println("w: "+s2);
//        String s3 = s1.replaceAll("\\W","");
//        System.out.println("W: "+s3);
//        String s4 = s1.replaceAll("\\d","");
//        System.out.println("d: "+s4);
//        String s5 = s1.replaceAll("\\D","");
//        System.out.println("D: "+s5);
//
//        String[] s6 = s1.split("\\$");
//        System.out.println(Arrays.toString(s6));
//        String[] s7 = s1.split("\\$",3);
//        System.out.println(Arrays.toString(s7));
//        System.out.println(s1.indexOf(s7[2]));

//        BiFunction<Float,Double,Double> x = Math::max;
//        System.out.println(Float.MAX_VALUE);
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(x.apply(Float.MAX_VALUE,Double.MAX_VALUE));

        int[] arr = new int[]{1,8,4,3,5,79,-8,-45,2,6};
        System.out.println("Original: "+Arrays.toString(arr));
        Arrays.sort(arr,0,5);
        System.out.println("sort(): "+Arrays.toString(arr));

        int[] arr1 = new int[]{1,8,4,3,5,79,-8,-45,2,6};
        Arrays.parallelSort(arr1,0,5);
        System.out.println("parallelSort(): "+Arrays.toString(arr1));

    }

    public static void firstCapitalLetter(String str){
        String output = "";
        String[] s = str.split(" ");
        for(String x : s){
            String first = x.substring(0,1);
            String last = x.substring(1);
            output += first.toUpperCase()+last.toLowerCase()+" ";
        }
        System.out.println(output);
    }

    public static void toggleEachWord(String str){
        String output = "";
        String[] s = str.split(" ");
        for(String x : s){
            String first = x.substring(0,1);
            String last = x.substring(1);
            output += first.toLowerCase()+last.toUpperCase()+" ";
        }
        System.out.println(output);
    }

    public static void reverseEachWord(String str){
        StringBuilder output = new StringBuilder();
        String[] s = str.split(" ");
        for(String x : s){
            StringBuilder sb = new StringBuilder(x);
            StringBuilder y = sb.reverse();
            output.append(y).append(" ");
        }
        System.out.println(output.toString().trim());
    }
}
