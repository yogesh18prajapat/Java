package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayDuplicates {

    public static void usingSets(){
        System.out.println("Using Collections to remove duplicate elements: ");
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"one","two","three","four","four","five","two","six");
        System.out.println("Original arraylist: "+arrayList);

        ArrayList<String> arrayList1 = new ArrayList<>(new HashSet<String>(arrayList));
        System.out.println("After removing duplicates: "+arrayList1);

    }
    public static void usingNewArraylist() {
        System.out.println("\n"+"Without using Collections remove duplicate elements: ");
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"one","two","three","four","four","five","two","six");
        System.out.println("Original arraylist: "+arrayList);

        ArrayList<String> arrayList1 = new ArrayList<String>();
        for(String i : arrayList){
            if(!arrayList1.contains(i)){
                arrayList1.add(i);
            }
        }
        System.out.println("After removing duplicates: "+arrayList1);
    }
}
