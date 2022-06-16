package com.company;

import java.util.*;

public class ArrayListEx {

    public static void arraylist(){
        ArrayList<String> array1 = new ArrayList<String>();
        Collections.addAll(array1,"camel","horse","lion","tiger","deer","cat","dog");


//   Iterating arraylist using java Iterator.
        Iterator<String> array1itr = array1.iterator();
        System.out.println("Iterating arraylist using java Iterator.");
        while (array1itr.hasNext()){
            System.out.println(array1itr.next());
        }
        System.out.println("\n");

//    Adding element at specific index.
        array1.add(3,"extraAdded");
        array1.set(4,"replaced");
        System.out.println("\n");

//    Traversing in insertion Order.
        System.out.println("Insertion order: ");
        for(String i : array1){
            System.out.println(i);
        }
        System.out.println("\n");

//    Traversing in Sorted Order.
        System.out.println("\n Sorted Order: ");
        Collections.sort(array1);
        for(String i : array1){
            System.out.println(i);
        }
        System.out.println("\n");


//    Traversing in Sorted Order.
        System.out.println("\n descending Order: ");
        Collections.sort(array1,Collections.reverseOrder());
        for(String i : array1){
            System.out.println(i);
        }
        System.out.println("\n");

//     Readonly Arraylist.
        try {
            List<String> arrayListOne = Collections.unmodifiableList(array1);
            arrayListOne.add("I added this");
            arrayListOne.remove("zebra");
            for (String i : arrayListOne) {
                System.out.println(i);
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Collections.unmodifiableList(array1):" +
                    "\n Can't modify this array list");
        }
         System.out.println("\n");

//   Adding elements through ListIterator.
       ListIterator<String> itr = array1.listIterator();
        while(itr.hasNext()){
           System.out.print(itr.next()+", ");
       }
        itr.add("AddedThrough");
        System.out.println("\n");

        System.out.println("Added elements through ListIterator: ");
        System.out.println(array1);
        System.out.println("\n");

//    Searching object
        System.out.println("Does array1 contains 'zebra': "+array1.contains("zebra"));
        System.out.println("Does array1 contains 'dog': "+array1.contains("dog"));
        System.out.println("\n");

//        System.out.println("Size of array1: "+array1.size());
//        array1.remove(6);
//        array1.remove(3);
//        array1.remove(0);
//        System.out.println(array1);
//        System.out.println("\n");

//     Converting linkedList to Arraylist
        System.out.println("Converting linkedList to Arraylist");
        LinkedList<String> linkedList = new LinkedList<String>();
        Collections.addAll(linkedList,"camel","horse","lion","tiger","deer","cat","dog");
        System.out.println("linkedList: "+linkedList);
        ArrayList<String> arrayList4 = new ArrayList<>(linkedList);
        System.out.println("arraylist: "+arrayList4);
        System.out.println("\n");


//     Converting HAshSet to Array
        System.out.println("Converting HAshSet to Array");
        Set<String> set = new HashSet<>();
        Collections.addAll(set,"camel","horse","lion","tiger","deer","cat","dog");
        Object[] array = set.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        System.out.println("\n");


//     Reversing Arraylist using ListIterator
        System.out.println("Reversing Arraylist using ListIterator");
        ArrayList<String> array5 = new ArrayList<String>();
        Collections.addAll(array5,"camel","horse","lion","tiger","deer","cat","dog");
        System.out.println("Original array: "+array5);
        ListIterator<String> lis = array5.listIterator(array5.size());
        System.out.print("Reverse array: ");
        while(lis.hasPrevious()){
            System.out.print(lis.previous()+", ");
        }
        System.out.println("\n");


    }
}
