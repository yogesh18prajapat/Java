package com.company;

import java.util.*;

public class VectorEx {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(5);
        vector.add(4);
        vector.add(3);
        vector.add(2);
        vector.add(1);
        vector.add(0);
        vector.add(3, 10);
        System.out.println(vector);

        Object[] array = vector.toArray();

        System.out.println(vector.elementAt(3));
        vector.ensureCapacity(6);
//        System.out.println(vector.equals(array));
        System.out.println(vector.get(3));
        System.out.println(vector.indexOf(1010));

        vector.setElementAt(50, 3);
        vector.addElement(8);
        System.out.println(vector);
        System.out.println(Arrays.toString(array));
        System.out.println("Size: " + vector.size());
        System.out.println("capacity: " + vector.capacity());
        System.out.println(vector);
        vector.removeIf((n) -> {
            if (n % 2 == 0) {
                return false;
            }
            return true;
        });
        System.out.println(vector);

        Object[] array1 = vector.toArray();
        System.out.println(Arrays.toString(array1));

        Collections.addAll(vector, 15, 14, 16, 19, 25, 18, 956, 152);
        System.out.println("Enumerations: ");
        Enumeration x = vector.elements();
        while (x.hasMoreElements()) {
            System.out.print(x.nextElement()+",");
        }
        System.out.println("");

    }

}
