package com.company;

import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("JL Batman",25));
        employees.add(new Employee("JL Superman",75));
        employees.add(new Employee("JL Cyborg",30));
        employees.add(new Employee("JL WonderWomen",80));
        employees.add(new Employee("Jl Flash",19));


//        for(Employee employee : employees){
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//        }

//        employees.forEach(employee ->{
//            System.out.println(employee.getName()+": "+employee.getAge());
//        });


//        System.out.println("\n over 30");
//        System.out.println("*****************");
//        employees.forEach(employee -> {
//            if(employee.getAge() > 30){
//                System.out.println(employee.getName().toUpperCase());
//            }
//        });
//
//        System.out.println("\n under 30");
//        System.out.println("*****************");
//        employees.forEach(employee ->{
//           if(employee.getAge() <= 30){
//               System.out.println(employee.getName().toUpperCase());
//           }
//        });

        printEmployeeByAge(employees,"Age over 30",employee -> employee.getAge() > 30);
        printEmployeeByAge(employees,"\nAge under 30",employee -> employee.getAge() <= 30);
        printEmployeeByAge(employees, "\nage under 25", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() < 25;
            }
        });
////      ***** PREDICATE ********
        System.out.println("\n Testing IntPredicate");
        IntPredicate greaterThan15 = i -> i >15;
        IntPredicate isEven = i -> i%2 == 0;
        IntPredicate lessThan500 = i -> i <= 500;
        System.out.println(greaterThan15.and(isEven).and(lessThan500).test(500));

        Random random = new Random();
        for(int i =0; i<10;i++) {
            System.out.println(random.nextInt(10));
        }

    }

    public static void printEmployeeByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition){
        System.out.println(ageText);
        for(Employee employee : employees){
            if(ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }
    }
}
