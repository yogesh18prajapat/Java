package com.company;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.addStudent("1DA145",71.01);
        student.addStudent("1DA146",59.99);
        student.addStudent("1DA147",85.25);
        student.addStudent("1DA148",95);
        student.addStudent("1DA149",95);
        student.addStudent("1DA150",81);
        student.addStudent("1DA151",77.01);

        student.getResults();

    }
}
