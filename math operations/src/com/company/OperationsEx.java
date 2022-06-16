package com.company;

import java.util.Scanner;

public class OperationsEx {
    private double a = 0;
    private double b = 0;

    public OperationsEx() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a = scanner.nextDouble();
        this.a = Math.round(a);
        System.out.print("Enter a number: ");
        double b = scanner.nextDouble();
        this.b = Math.round(b);

        add();
        minus();
        multiply();
        divide();
    }

    private void add() {
        System.out.println(a + " + " + b + " =" + (a + b));
    }

    private void minus() {
        System.out.println(a + " - " + b + " =" + (a - b));
    }

    private void multiply() {
        System.out.println(a + " * " + b + " =" + (a * b));
    }

    private void divide() {
        if (b != 0) {
            System.out.println(a + " / " + b + " =" + (a / b));
        } else {
            System.out.println(a + " can't be divisible by '0'");
        }
    }
}
