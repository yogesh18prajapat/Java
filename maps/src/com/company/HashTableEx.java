package com.company;


import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>();

        hashtable.put(1,"one");
        hashtable.put(7,"seven");
        hashtable.put(6,"six");
        hashtable.put(3,"three");
        hashtable.put(4,"four");
        hashtable.put(5,"five");
        hashtable.put(2,"two");

        for(Map.Entry<Integer,String> i : hashtable.entrySet()){
            System.out.println(i);
        }



    }
}
