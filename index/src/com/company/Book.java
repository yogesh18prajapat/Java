package com.company;

public class Book {
    public String name ;
    public double price;

    public Book(String name, double price){
        this.name = name;
        this.price = price;
    }
    public static void  thisIsStatic(){
        System.out.println("Static Method is called");
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    public Book newBook(String name, double price){
        return new Book(name, price);
    }

    @Override
    public String toString() {
        return"name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
