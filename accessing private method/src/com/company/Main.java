package com.company;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        try{
            Class<?> cls = Class.forName("com.company.Test");
            Method method = cls.getDeclaredMethod("welcome",String.class, String.class);
            method.setAccessible(true);
            Object obj = method.invoke(new Test(),"First_Name","Last_Name");
            String result = (String) obj;
            System.out.println(result);
        }catch (Exception e){

            System.out.println("Error: "+e);
        }    }
}
