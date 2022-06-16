package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BfMap {

    public static void maps() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        BiFunction<Integer, String, String> m = (key, value) -> "Key: " + key + "-> " + value + " - " + Collections.frequency(map.values(), value);
        map.forEach((k, v) -> System.out.println(m.apply(k, v)));

    }
}
