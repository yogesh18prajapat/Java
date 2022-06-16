package com.company;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.Map;

public class TreeMapEx {

    public static void main(String[] args) {

        TreeMap<Integer,String> treeMap = new TreeMap<>();


        treeMap.put(9,"nine");
        treeMap.put(7,"seven");
        treeMap.put(8,"eight");
        treeMap.put(1,"one");
        treeMap.put(2,"two");
        treeMap.put(3,"three");
        treeMap.put(4,"four");
//        treeMap.put(5,"five");
        treeMap.put(6,"six");

        System.out.println("Original TreeMap: "+treeMap);

        //It returns the comparator that arranges the key in order, or null if the map uses the natural ordering.
        Comparator comp = treeMap.comparator();
        System.out.println("Comparator: "+comp);

        //greater that entered key, if entered key is not found
        System.out.println("ceilingEntry(): "+treeMap.ceilingKey(5));

        //lesser than entered key, if entered key is not found
        System.out.println("floorEntry(): "+treeMap.floorKey(5));

        //Return keys in descending order.
        Set x = treeMap.descendingKeySet();
        System.out.println("treeMap.descendingKeySet(): "+x);

        //Return entries(Key-Value pair) in descending order.
        Map i = treeMap.descendingMap();
        System.out.println("treeMap.descendingMap(): "+i);

        System.out.println("firstEntry(): "+treeMap.firstEntry());
        System.out.println("lastEntry(): "+treeMap.lastEntry());
        System.out.println("firstKey(): "+treeMap.firstKey());
        System.out.println("lastKey(): "+treeMap.lastKey());



        //"higherEntry()" Strictly returns higher entry than given key.
        System.out.println("higherEntry(): "+treeMap.higherEntry(5));
        //"lowerEntry()" Strictly returns lower entry than given key.
        System.out.println("lowerEntry(): "+treeMap.lowerEntry(5));
        System.out.println("firstEntry(): "+treeMap.higherKey(5)); //Returns only Key
        System.out.println("firstEntry(): "+treeMap.lowerKey(5)); //Returns only key


//        "pollFirstEntry()" Removes first entry in a Map
      System.out.println("pollFirstEntry(): "+treeMap.pollFirstEntry());
//        "pollLastEntry()" Removes last entry in a Map
      System.out.println("pollLastEntry(): "+treeMap.pollLastEntry());

      treeMap.put(0,"Zero");
      System.out.println("get(): "+treeMap.get(1));
      System.out.println(treeMap.containsKey(5));
      System.out.println(treeMap.containsValue("Zero"));

      treeMap.replace(8,"replaced8");
      treeMap.replace(7,"seven","replaced7");

      treeMap.replaceAll((k,v) -> v+=" - Added this through replaceAll");

//        System.out.println(treeMap.values());

        for(Map.Entry<Integer,String> a : treeMap.entrySet()){
            System.out.println(a.getKey()+": "+a.getValue());
        }

        System.out.println("subMap: "+treeMap.subMap(3,7));
        System.out.println("subMap with boolean: "+treeMap.subMap(3,false,7,true));

        System.out.println("headMap: "+treeMap.headMap(4));
        System.out.println("headMap with boolean: "+treeMap.headMap(4,true));

        System.out.println("tailMap: "+treeMap.tailMap(4));
        System.out.println("tailMap with boolean: "+treeMap.tailMap(4,false));

    }
}
