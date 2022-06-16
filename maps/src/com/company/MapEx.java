package com.company;

import java.util.*;

public class MapEx {

    void mapWithoutGenerics() {
        java.util.Map map = new HashMap<>();

        map.put(100, "hundred");
        map.put(10, "ten");
        map.put(1, "one");
        map.put(0, "zero");
        map.replace(100, "thousand");
        System.out.println(map.values());
        System.out.println(map.get(1)); //Returns the value of entered key

        Set set = map.entrySet();//Converting to Set so that we can traverse

        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry map1 = ((Map.Entry) itr.next());
            System.out.println(map1.getKey() + " " + map1.getValue());
        }
    }

    void mapWithGenerics(){
        java.util.Map<Integer,String> map = new HashMap<Integer, String>();

        map.put(100, "hundred");
        map.put(10, "ten");
        map.put(1, "one");
        map.put(0, "zero");
        map.replace(100, "thousand");
        System.out.println("map.values(): "+map.values());
        System.out.println(map.get(1)); //Returns the value of entered key

//        map.entrySet() gives both key and value.
        for(Map.Entry i : map.entrySet()){
            System.out.println(i);
        }

        map.compute(0,(k,v) -> v += " - Computed");

        System.out.println("Remove ************");
        System.out.println(map.remove(0,"Zero")); //Returns False because it didn't find "Zero" value
        for(Map.Entry i : map.entrySet()){
            System.out.println(i);
        }

        System.out.println("\n after using replace all");
        map.replaceAll((k,v) -> v = "Replaced");
        for(Map.Entry i : map.entrySet()){
            System.out.println(i);
        }

       Map i = Collections.synchronizedMap(map);



    }

}
