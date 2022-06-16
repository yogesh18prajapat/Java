package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringObjects {
    private final List<String> arrayList =new ArrayList<>();
    public StringObjects(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter anything other than letters to exit");
        while(true){
            System.out.print("Enter value: ");
            String input = scanner.nextLine();
            //symbols and numbers are not allowed
           if(Pattern.matches("[a-zA-z]+",input)){
                arrayList.add(input);
                Collections.sort(arrayList);
            }else{
               break;
            }
        }
    }
    public Object[] getArray(){
        int size = arrayList.size();
        Object[] newArray = new Object[size];
        int upper = (size / 2)+ (size % 2);
        for(int i=0; i< size;i++) {
            newArray[i] = arrayList.get(i);
            if (i < upper) {
                newArray[i] = arrayList.get(i).toUpperCase();
            }else{
                newArray[i] = arrayList.get(i).toLowerCase();
            }
        }
        return newArray;
    }

}
