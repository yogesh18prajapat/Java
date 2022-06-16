package com.company;

import java.util.*;

public class Student {
    private String registration_number;
    private double marks;
    HashMap<String,Double> students;
    TreeMap<String,String> result = new TreeMap<>();

    public Student(){
        this.students = new HashMap<>();
    }

    public Student(String registration_number, double marks){
        this.registration_number = registration_number;
        this.marks = marks;
    }

    public void addStudent(String registration_number, double marks){
        students.put(registration_number,marks);
    }

    public void getResults(){
        for(Map.Entry<String,Double> i : students.entrySet()){
            if(i.getValue() > 90){
                result.put(i.getKey(),"Gold");
            }else if (i.getValue()>= 80 && i.getValue() < 90){
                result.put(i.getKey(),"Silver");
            }else if (i.getValue()>= 70 && i.getValue() < 80){
                result.put(i.getKey(),"Bronze");
            }else{
                result.put(i.getKey(),"none");
            }
        }

        List<Map.Entry<String,String>> list = new LinkedList<>(result.entrySet());
//        list.sort(Map.Entry.comparingByValue());
        Collections.sort(list,(l1,l2) ->
                l1.getValue().compareTo(l2.getValue())
                );
        for(Map.Entry<String,String> i : list){
            System.out.println(i.getKey()+": "+i.getValue());
        }
    }

}
