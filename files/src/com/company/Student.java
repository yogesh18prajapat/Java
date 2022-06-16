package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {
    String name;
    String register_no;

    public Student(String name, String register_no ){
        this.name = name;
        this.register_no = register_no;
    }

    public String getName() {
        return name;
    }

    public String getRegister_no() {
        return register_no;
    }


    @Override
    public String toString() {
        return name + " -> " + register_no ;
    }
}
//    Student s1 = new Student("monkey","101");
//    Student s2 = new Student("elephant","102");
//    Student s3 = new Student("dog","103");
//    Student s4 = new Student("cat","104");
//    Student s5 = new Student("sloth","105");
//    Student s6 = new Student("bunny","106");
//
//    List<Student> list = new ArrayList<>();
//        Collections.addAll(list,s1,s2,s3,s4,s5,s6);
////        list.forEach(System.out::println);
