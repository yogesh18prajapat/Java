package com.company;

public class GarbageCollectorEx {

    protected void finalize(){
        System.out.println("Garbage collected");
    }

    public static void main(String[] args) {

        GarbageCollectorEx e = new GarbageCollectorEx();
        GarbageCollectorEx e1 = new GarbageCollectorEx();

        e1=e;
       System.gc();

//        By nulling the reference
//        By assigning a reference to another
//        By anonymous object etc.

//        Note: Neither finalization nor garbage collection is guaranteed.
    }
}
