package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Bill {
    private Item item;
    private double total;
    private final ArrayList<Item> items;
    private final ArrayList<Item> availableItems = new ArrayList<>();


    public Bill() {
        this.items = new ArrayList<Item>();
        availableItems.add(new Item("item1", 10.26));
        availableItems.add(new Item("item2", 20.459));
        availableItems.add(new Item("item3", 30.155));
        availableItems.add(new Item("item4", 40.89));
        availableItems.add(new Item("item5", 50.65));
        availableItems.add(new Item("item6", 60.25));
        availableItems.add(new Item("item7", 70.128));
        availableItems.add(new Item("item8", 80.15));
        availableItems.add(new Item("item9", 90.687));
        availableItems.add(new Item("item10", 100.021));
        this.total = 0;
    }
//    public void addItem(String name,int quantity){
//        for(Item i : availableItems){
//            if(name.equals(i.getName())){
//                Item newItem = new Item(name,i.getPrice());
//                newItem.setQuantity(quantity);
//                items.add(newItem);
//                total += newItem.getPrice()*newItem.getQuantity();
//                return;
//            }
//        }
//        System.out.println(name+": Item not found");
//    }

    public ArrayList<Item> getItems() {
        return items;
    }


    public void userAddingItems() {
        System.out.println("If you enter quantity value other than integers, it will generate Bill \n");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter '0' to generate bill for selected Items");
                //User input for Item name.
                System.out.print("Enter item name: ");
                String itemName = scanner.next();
                 //Calls getItem and takes String as input and returns Object(Item)
                 Item i = getItem(itemName);
                 //If user enters below mention then it will generate bill.
                if (itemName.equals("0")) {
                    System.out.println(toString());
                    return;
                } //Validation for input item.If it is false then it will display message
                else if (availableItems.contains(getItem(itemName))) {
                    scanner.nextLine();
                //quantity(user input value) if itemName(UIV) matches any availableItem
                    System.out.print("Enter '" + itemName + "' quantity: ");
                    boolean integer = scanner.hasNextInt();
                //Validation, if entered value is not integer then it will generate bill.
                    if (integer) {
                        int num = scanner.nextInt();
                        scanner.nextLine();
                        i.setQuantity(num);
                        items.add(i);
                        total += i.getPrice() * i.getQuantity();
                    } else {
                        System.out.println(toString());
                        return;
                    }
                } else {
                    System.out.println("'" + itemName + "'is not available.");
                }

        }

    }

    private Item getItem(String name){
        for (Item i : availableItems){
            if(i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }

    public String toString() {
        System.out.println("Computer generated Bill");
        String output = "";
        for (Item i : items) {
            output += i.getName() + ": " + i.getQuantity()  + " * " + i.getPrice() + " = " + (i.getPrice() * i.getQuantity()) + "\n";
        }
        return output + "Total: " + total + "\n";
    }

}
