package com.company;

import java.util.ArrayList;

public class Bill {
    private Item item;
    private double total;
    private final ArrayList<Item> items;
    private final ArrayList<Item> availableItems = new ArrayList<>();


    public Bill(){
        this.items = new ArrayList<Item>();
        availableItems.add(new Item("item1",10));
        availableItems.add(new Item("item2",20));
        availableItems.add(new Item("item3",30));
        availableItems.add(new Item("item4",40));
        availableItems.add(new Item("item5",50));
        availableItems.add(new Item("item6",60));
        availableItems.add(new Item("item7",70));
        availableItems.add(new Item("item8",80));
        availableItems.add(new Item("item9",90));
        availableItems.add(new Item("item10",100));
        this.total = 0;
    }
    public void addItem(String name,int quantity){
        for(Item i : availableItems){
            if(name.equals(i.getName())){
                Item newItem = new Item(name,i.getPrice());
                newItem.setQuantity(quantity);
                items.add(newItem);
                total += newItem.getPrice()*newItem.getQuantity();
                return;
            }
        }
        System.out.println(name+": Item not found");
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public String toString(){
        System.out.println("Computer generated Bill");
        String output = "";
        for(Item i:items){
            output += i.getName()+": "+i.getPrice()+"*"+i.getQuantity()+" = "+(i.getPrice()*i.getQuantity())+"\n";
        }
        return output +"Total: "+total+"\n";
    }

}
