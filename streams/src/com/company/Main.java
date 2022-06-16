package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> numbers = Arrays.asList(
                "A15", "A58",
                "Z18", "Z87",
                "H45", "H87", "H12", "h72",
                "C14", "C52",
                "E15", "E01", "E94", "E65");

//        List<String> sortedNumbers = numbers.
//                                     stream()
//                .map(String::toUpperCase)
//                .filter(x -> x.startsWith("H"))
//                .sorted()
//                .collect(Collectors.toList());
//
//        for(String i : sortedNumbers){
//            System.out.println(i);
//        }

       long count =  numbers.stream()
                .map(String::toUpperCase)
                .filter(s-> s.startsWith("H"))
               .peek(System.out::println)
               .sorted()
               .count();
//                .forEach(System.out::println);

        System.out.println(count);
//
//        Employee john = new Employee("John Cena",40);
//        Employee rock = new Employee("Rock Lee",18);
//        Employee tom = new Employee("Tom Holland",19);
//        Employee itachi = new Employee("Itachi uchiha",25);
//        Employee eren = new Employee("Eren Yeager",18);
//
//        Department ba = new Department("Bad");
//        ba.addEmployee(rock);
//        ba.addEmployee(itachi);
//        ba.addEmployee(eren);
//
//        Department chill = new Department("Chill");
//        chill.addEmployee(john);
//        chill.addEmployee(tom);
//
//        List<Department> departments = new ArrayList<>();
//        departments.add(ba);
//        departments.add(chill);
//
////        departments.stream()
////                .flatMap(department -> department.getEmployees().stream())
////                .forEach(System.out::println);
//
//        departments.stream()
//                .flatMap(department -> department.getEmployees().stream())
//                .reduce((e1,e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
//                .ifPresent(System.out::println);


    }
}
