package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {

            Employee techOuts = new Employee("srinivas", 01, "add1");

            techOuts.addEmployee("one",1,"Address one");
            techOuts.addEmployee("two",2,"Address two");
            techOuts.addEmployee("Three",3,"Address Three");
            techOuts.addEmployee("four",4,"Address Four");

            ArrayList<Employee> employees = techOuts.getEmployees();
//        for(Employee i : employees){
//            System.out.println(i.toString());
//        }

            System.out.print("Please enter your Employee Id: " +"\n");
            int id = scanner.nextInt();
            try{
                techOuts.enter(employees,id);
            }catch (InvalidEmployeeIdException err){
                System.out.println(err);
            }
        }



    String name = "sai";
    int id;
    String address = "Hyderabad";
    ArrayList<Employee> employees;


    public Employee(String name, int id, String address){
        this.name = name;
        this.id = id;
        this.address = address;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }
    public void addEmployee(String name, int id, String address){
        employees.add(new Employee(name,id,address));
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Employee Details \n" +
                "name: " + name  +
                ", id: #" + id +
                ", address: " + address;

    }
    public void enter(ArrayList<Employee> employees, int id) throws InvalidEmployeeIdException {

        for(int i = 0; i< employees.size(); i++){
            Employee employee = employees.get(i);
            if(employee.getId() == id){
                System.out.println("Welcome to Office"+"\n"
                +employee.toString()
                );
                return;
            }
        }throw new InvalidEmployeeIdException(id);

    }

}
class InvalidEmployeeIdException extends Exception{

    InvalidEmployeeIdException(int id){
        super(" Employee ID '"+id+"' is not found," +
                "please enter the valid ID");
    }

}
