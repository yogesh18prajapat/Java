package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args){
        // write your code here
//        Badminton b = new Badminton();
//        for(Map.Entry i : b.getAvailable_slots().entrySet()){
//            System.out.println(i.getKey()+" -> "+i.getValue());
//        }
//
//        b.createSlots(10,200);


//        int x = 0;
//        for (int i = 1; i <= 10; i++) {1
//            x++;
//                String time = " " + (9 + i) + ":00-" + (9 + i) + ":30";
//                System.out.println(x+"-> "+time);
//                x++;
//                String time1 = " " + (9 + i) + ":30-" + (10 + i) + ":00";
//            System.out.println(x+"-> "+time1);
//        }
//            x++;

        try{
            SportsComplex.SC();
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }


    }




}
