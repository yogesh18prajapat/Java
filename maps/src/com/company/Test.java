package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add('a');
        arrayList.add('b');
        arrayList.add('b');
        arrayList.add('a');
        arrayList.add("10");
        arrayList.add(10);

        ArrayList li = removeDuplicates(arrayList);

        for(Object i : li){
            System.out.println(i);
        }

    }
    public static ArrayList<?> removeDuplicates(ArrayList<?> list){
        ArrayList newList = new ArrayList();

        for(Object i :list){
            if(!newList.contains(i)){
                newList.add(i);
            }
        }
        return newList;
    }





}
