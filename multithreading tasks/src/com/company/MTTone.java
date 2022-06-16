package com.company;

public class MTTone implements  Runnable{
    static int x;
    static int y;
    private static int sum;
    private static int avg;
    public MTTone(int x, int y){
        this.x = x;
        this.y = y;
    }
     @Override
    public void run(){
//         add();
//         avg();
//         display();
     }

     public static void add(){
         sum = x+y;
     }
     public static void avg(){
        avg = sum/2;
     }

     public static void display(){
         System.out.println("Sum: "+sum+"\nAvg: "+avg);
     }
}
