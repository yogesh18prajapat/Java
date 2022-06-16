package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        Employee employee = new Employee();
        employee.createFile();
        employee.writeFile();
        employee.readFile();

    }
}
