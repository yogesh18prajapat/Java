package com.company;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Employee emp = new Employee(101,"employee",25);
        Employee emp1 = new Employee(102,"employee2",25);
        Employee emp2 = new Employee(103,"employee",25);
        Employee emp3 = new Employee(104,"employee2",25);
        Employee emp4= new Employee(105,"employee",25);
        Employee emp5 = new Employee(106,"employee2",25);

        try {
            FileOutputStream fileOut = new FileOutputStream("studentData.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(emp);
            objOut.writeObject(emp1);
            objOut.writeObject(emp2);
            objOut.writeObject(emp3);
            objOut.writeObject(emp4);
            objOut.writeObject(emp5);
            objOut.flush();
            objOut.close();
            fileOut.close();
            System.out.println("successfully uploaded");
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            FileInputStream fileIn = new FileInputStream("studentData.txt");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
//            ObjectInputStream in = new ObjectInputStream(new FileInputStream("studentData.txt"));
            for(int x =0; x<6;x++){
                Employee y = (Employee) objIn.readObject();
                System.out.println(y.getId());
            }
            objIn.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
