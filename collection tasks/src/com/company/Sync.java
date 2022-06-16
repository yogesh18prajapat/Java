package com.company;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Sync {
    public static void main(String[] args) {

// //   Synchronization of sets and arraylist
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);

        Map<String,Integer> syncMap = Collections.synchronizedMap(map);

        ArrayList<String> arrayList = new ArrayList<String>(map.keySet());
        Collections.sort(arrayList);
        System.out.println(arrayList);
        List<String> syncArray = Collections.synchronizedList(arrayList);

        CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<>(arrayList);
        System.out.println(al);

    }
}
