package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Student {
    private String name;
    private double marks;
    HashMap<String,Double> students;

    public Student(){
        this.students = new HashMap<>();
    }

    public Student(String name, double marks){
        this.name = name;
        this.marks = marks;
    }

    public void addStudent(String name, double marks){
        students.put(name,marks);
    }

    public void getResults(){
        TreeMap<String,String> result = new TreeMap<>();
        for(Map.Entry<String,Double> i : students.entrySet()){
            if(i.getValue() > 60.0){
                result.put(i.getKey(),"pass");
            }else{
                result.put(i.getKey(),"fail");
            }
        }

        for(Map.Entry<String,String> i : result.entrySet()){
            System.out.println(i.getKey()+": "+i.getValue());
        }
    }




}
