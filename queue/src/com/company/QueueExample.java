package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Deque deque = new ArrayDeque();
        deque.add("one");
        deque.add("two");
        deque.add("three");
        deque.add("four");

        deque.offerFirst("offerFirst");
        deque.offerLast("offerLast");
        deque.offer("offer");
//        for(Object i : queue){
//            System.out.println(i);
//        }
        System.out.println("");
        System.out.println("peek: "+deque.peek());
        System.out.println("peek first: "+deque.peekFirst());
        System.out.println("peek last: "+deque.peekLast());
        System.out.println("queue.element(): "+deque.element());
        for(Object i : deque){
            System.out.println(i);
        }
        System.out.println("poll(): "+deque.poll());
        System.out.println("pollFirst(): "+deque.pollFirst());
        System.out.println("pollLast(): "+deque.pollLast());


        System.out.println("---Queue---");
        Queue queue1 = new ArrayDeque();
        queue1.add("one");
        queue1.add("two");
        queue1.add("three");
        queue1.add("four");

        queue1.offer("offer");
//        for(Object i : queue){
//            System.out.println(i);
//        }
        System.out.println("");
        System.out.println("peek: "+queue1.peek());
        System.out.println("queue.element(): "+queue1.element());
        for(Object i : queue1){
            System.out.println(i);
        }
        System.out.println("poll(): "+queue1.poll());

    }

}
