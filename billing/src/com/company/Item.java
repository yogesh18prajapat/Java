package com.company;

public class Item {
    String name;
    int quantity;
    double price;
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name +" -> " + price ;
    }
}


