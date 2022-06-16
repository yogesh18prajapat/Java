package com.company;

import java.awt.*;
import java.awt.List;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {

    public static  void main(String[] args) {
//     arrays();
//     arrayList();
//     linkedList();
//     set();
//     linkedHashSet();
// linkedHashSet is same as hashSets but maintains the insertion order.
//     vector();
//     stack();
//     priorityQueue();
//     deque();

//String a = "String";
//        System.out.println(a.compareToIgnoreCase("r"));
//


    }

    public static void arrays() {
        String[] array = {"string1", "string2", "string3", "string4", "string5", "string6", "string7", "string8"};

        //Length of an array
        System.out.println("Array length: " + array.length);

        //Replacing array at index 0
        array[0] = "Replaced1";

//        To convert an array into array list, and we can modify also
//       ArrayList arrayAsList = new  ArrayList(Arrays.asList(array));
    }

    public static void arrayList() {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("String");
        arraylist.set(0, "String");
        arraylist.add(0, "String0");
        System.out.println("arraylist.get(0): "+arraylist.get(0));
        arraylist.remove(0);
        Collections.sort(arraylist);
        arraylist.add("string1");
        arraylist.add("string2");
        arraylist.add("string3");
        arraylist.add("string4");
        arraylist.add("string5");
        arraylist.add("string6");
        arraylist.add("string7");
        arraylist.add("string8");
        arraylist.add("string9");
        arraylist.add("string10");

        for (String i : arraylist) {
            System.out.println(i);
        }
        System.out.println("Element at index 0: " + arraylist.get(0));

        System.out.println("After removing index 3");
        arraylist.remove(3);
        for (String i : arraylist) {
            System.out.println(i);
        }
        System.out.println("Element at index 0: " + arraylist.get(0));

        arraylist.set(0, "Replaced1");
        for (String i : arraylist) {
            System.out.println(i);
        }

        //Collections.sort() is only good for Strings without numbers.
        System.out.println("After sorting");
        Collections.sort(arraylist);
        for (String i : arraylist) {
            System.out.println(i);
        }
        arraylist.forEach((n) -> System.out.println("forEach :- " + n));

 //      Creating a new arraylist
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("ListOneAddedOne");
        arrayList1.add("ListOneAddedTwo");


        arraylist.addAll(arrayList1);
        arraylist.forEach((n) -> System.out.println(n));

//      Creating a new arraylist
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("list2starts");
        arrayList2.add("ListTwoAddedOne");
        arraylist.addAll(arrayList2);
        arraylist.forEach((n) -> System.out.println(n));

//        Using Iterator.
        Iterator str = arraylist.iterator();
        while(str.hasNext()){
            System.out.println(str.next());
        }

//        Using ListIterator.
        ListIterator list = arraylist.listIterator(arraylist.size());
        while (list.hasPrevious()) {
            System.out.println(list.previous());
        }

//        Using forEach()
        arraylist.forEach((n) -> System.out.println(n));

//        Using forEachRemaining()
        Iterator iterator = arraylist.iterator();
        iterator.forEachRemaining((n) -> System.out.println("Final: "+n));


//      Returns index position of specified element
        System.out.println(Collections.binarySearch(arraylist,"string4"));

        System.out.println("max value: "+Collections.max(arraylist));
        System.out.println("min value: "+Collections.min(arraylist));
        System.out.println(arraylist);
//      distance parameter takes 2, and it adds last 2 elements at start of the list.
        Collections.rotate(arraylist,5);
        System.out.println(arraylist);

        System.out.println(arrayList1);
        Collections.sort(arrayList1,Collections.reverseOrder());
        System.out.println(arrayList1);
    }

    public static void linkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("string1");
        linkedList.add("string2");
        linkedList.add("string3");
        linkedList.add("string4");
        linkedList.add("string5");
        linkedList.add("string6");
        linkedList.add("string7");
        linkedList.add("string8");
        linkedList.add("string9");
        linkedList.push("string10");
        linkedList.pop();

        linkedList.add(5, "Added at index 5");
        linkedList.get(2);
        linkedList.set(2, "Replaced element");
        linkedList.getFirst();
        linkedList.getLast();
        linkedList.addFirst("Element added at index 0");
        linkedList.addLast("element added at last index");
        linkedList.remove(5);

        //Output using for loop
//        for (String listElement : linkedList) {
//            System.out.println(listElement);
//        }
        //output using Iterator
//        Iterator myList = linkedList.iterator();
//        while(myList.hasNext()) {
//            System.out.println(myList.next());
//        }
        //output using forEach loop
        linkedList.forEach(
                (val) -> {
                    System.out.println(val);
                }
        );


    }

    public static void set(){
        Set<String> set = new HashSet<>();

        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        set.removeIf(str -> str.contains("one"));


        System.out.println(set.toString());
        System.out.println(set.contains("nine"));
        set.removeAll(set);
        System.out.println(set.toString());
//creating an arrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        arrayList.add("five");
        arrayList.add("one");

        System.out.println("Length of arraylist: "+arrayList.size());
        System.out.println("arraylist : "+arrayList.toString());

        Set<?> set1 = new HashSet<>(arrayList);
        System.out.println("Length of set: "+set1.size());
        System.out.println("set1: "+set1.toString());
    }

    public static  void linkedHashSet(){
        Set<String> set = new LinkedHashSet<>();

        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        set.removeIf(str -> str.contains("one"));


        System.out.println(set.toString());
        System.out.println(set.contains("nine"));
        set.removeAll(set);
        System.out.println(set.toString());
//creating an arrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        arrayList.add("five");
        arrayList.add("one");

        System.out.println("Length of arraylist: "+arrayList.size());
        System.out.println("arraylist : "+arrayList.toString());

        Set<?> set1 = new LinkedHashSet<>(arrayList);
        System.out.println("Length of set: "+set1.size());
        System.out.println("set1: "+set1.toString());
    }

    public static void vector() {
        Vector<String> vector = new Vector<String>();
        vector.add("Ayush");
        vector.add("Amit");
        vector.add("Ashish");
        vector.add("Garima");

        Iterator<String> itr = vector.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
//        Enumeration<String> itr1 = vector.elements();
//        while (itr1.hasMoreElements()) {
//            System.out.println(itr1.nextElement());
//        }
        System.out.println("------------");
        vector.add(1, "Added");
        vector.set(3, "Edited");
        System.out.println("Capacity : " + vector.capacity());
        System.out.println("Contains 'Added' :" + vector.contains("Added")); // 1(found), -1(not found)

//        vector.forEach((n) -> System.out.println(n));
//        vector.forEach(System.out::println);

    }

    public static void stack() {
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.push("garima");
        stack.push("Deleted");
        stack.pop();
        stack.add(3, "Added");
        System.out.println(stack.search("Added"));
        for (String s : stack) {
            System.out.println(s + ": " + s.hashCode());
        }

    }

    public static void priorityQueue() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        System.out.println("queue.element(): " + queue.element());
        System.out.println("queue.peek(): " + queue.peek());
        System.out.println("iterating the queue elements:");
        queue.forEach((n) -> System.out.println("1 : " + n));


        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println("after removing two elements:");
        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void deque(){
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");


        for (String str : deque) {
            System.out.println(str);
        }

        System.out.println("After using 'addFirst() & addLast():'");
        deque.addFirst("First");
        deque.addLast("last");
        for (String str : deque) {
            System.out.println(str);
        }
        System.out.println("-----------------");
        System.out.println("deque.remove(): "+deque.remove());
        System.out.println("deque.removeFirst(): "+deque.removeFirst());
        System.out.println("deque.removeLast(): "+deque.removeLast());
        System.out.println("deque.remove('Ajay'): "+deque.remove("Ajay"));
        System.out.println("-----------------");

        System.out.println("After using 'remove methods'");
        for (String str : deque) {
            System.out.println("final :"+str);
        }
    }





}







