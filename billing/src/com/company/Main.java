package com.company;

public class Main {

    public static void main(String[] args) {

        Bill bill = new Bill();

        bill.addItem("item1",2);
        bill.addItem("item5",2);
        bill.addItem("item9",2);
        bill.addItem("item11",2);
        System.out.println(bill);




    }
}
