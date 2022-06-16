package com.company;

import java.util.Set;

public class Main {

    public static void main(String []args) {
        TreeSet test = new TreeSet(1,"nameo");
        TreeSet test1 = new TreeSet(100,"namez");
        TreeSet test2 = new TreeSet(50,"namea");
//TreeSet do no allow duplicate elements.
//In this example we used compareTo() method to compare names,
// so if the names are equal then it will store only first element and ignores the second element
        Set<TreeSet> set = new java.util.TreeSet<>();
        set.add(test);
        set.add(test1);
        set.add(test2);

        for(TreeSet i : set){
            System.out.println(i.getId());
        }

    }
}
