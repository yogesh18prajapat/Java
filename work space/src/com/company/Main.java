package com.company;


import java.util.*;

public class Main {

    public static void main(String[] ags){
        Map<String,Integer> m = new HashMap<>();
        m.put("one",1);
        m.put("two",2);
        m.put("three",3);
        m.put("four",4);
        m.put("five",5);
//        m.replace(2,"replaced");
//        m.forEach((x,y)->{
//            System.out.println(x+": "+y);
//        });

        ArrayList<String> al = new ArrayList<String>();
        al.add("new");
        al.add("new");
        al.add("new");
        al.add("new");
        al.add("new");
        al.add("new");
        al.add("new");

        ListIterator<String> itr = al.listIterator();

        while (itr.hasNext()) {
//                itr.next();
            System.out.println(itr.next());


        }

//
//        ListIterator<String> i = al.listIterator();
//
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }

//
//        System.out.println(m.getClass());

//        Iterator<Map.Entry<Integer,String>> itr = m.entrySet().iterator();
//        while(itr.hasNext()){
//            Map.Entry<Integer,String> x = itr.next();
//            System.out.println(x.getKey()+": "+x.getValue());
////            System.out.println(itr.next());
//        }

//        for(Map.Entry<Integer,String> i : m.entrySet()){
//            System.out.println(i.getKey()+": "+i.getValue());
//        }

//        System.out.println("Values");
//        for(String i : m.values()){
//            System.out.println(i);
//        }
//        System.out.println("Keys");
//        for(Integer i : m.keySet()){
//            System.out.println(i);
//        }

//        for(int i=0; i<10;i++){
//            if(i==5) break;
//            System.out.println(i);
//        }

//        int x = 10;
//        int y = 20;
//        y = x;
//        System.out.println(x);

        Sample s = new Sample();

//        s.method1();
//        s.method2();
//        System.out.println(s.x);
//        System.out.println(s.y);
//        s.y= "changed";
//        System.out.println(s.y);

    }
}


