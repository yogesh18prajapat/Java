package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class CROWDDefile {
    public static void main(String[] args) {

////    CREATE
        File obj = new File("fileName.txt");
        try{
            if(obj.createNewFile()){
                System.out.println(obj.getName()+" created successfully");
            }else{
                System.out.println("file already exists");
            }
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
////    WRITE
        try {
            FileWriter obj1 = new FileWriter("fileName1.txt");
            obj1.write("ihdefhreghrt");
            obj1.close();
            System.out.println("Wrote successfully.");
        }catch (IOException e){
            e.printStackTrace();
        }
////    READ
        try {
            File obj3 = new File("fileName1.txt");
            Scanner reader = new Scanner(obj3);
            if(reader.hasNext()){
                System.out.println(reader.nextLine());
            }
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
////    DELETE
        try{
            File obj4 = new File("fileName.txt");
            if(obj4.delete()){
                System.out.println(obj4.getName()+" deleted successfully.");
            }else{
                System.out.println("failed to delete");
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("**************************************************");
        String name = "java.txt";
        System.out.println(name.substring((name.lastIndexOf(".")+1)));


    }
}
