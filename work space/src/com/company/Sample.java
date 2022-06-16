package com.company;

public class Sample {


//    String x ="Instance variable";
//    static String y = "static variable";
//
//    void method1(){
//        System.out.println("Instance method");
//    }
//    static  void method2(){
//        System.out.println("static  method");
//    }
    public static void main(String[] args){
        String name;
        for(int i=0; i<Integer.MAX_VALUE;i++){
             name = "a"+i;
            System.out.println(name);
        }
    }

}
