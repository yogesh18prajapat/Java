package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTwo {
    void m(){
        int num = 10/0;
    }
    void n()throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("exception handled");
            System.out.println("exception: "+e);

        }
    }
    public static void main(String args[]){
        ExceptionTwo obj=new ExceptionTwo();
        obj.p();
        System.out.println("normal flow...");
    }
}
