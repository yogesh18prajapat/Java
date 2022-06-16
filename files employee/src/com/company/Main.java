package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Batman",001,24);
        Employee e2 = new Employee("Batman",001,24);
        Employee e3 = new Employee("Batman",001,24);
        Employee e4 = new Employee("Batman",001,24);
        Employee e5 = new Employee("Batman",001,24);

        List<Employee> employees = new ArrayList<>();
        Collections.addAll(employees,e1,e2,e3,e4,e5);

//        File file
    }
}
