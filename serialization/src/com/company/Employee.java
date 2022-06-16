package com.company;

import java.io.*;

public class Employee implements Serializable {
    private static final long SerialVersionUID= 1L;
    private int id;
    transient String name;
    transient int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() throws Exception {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
