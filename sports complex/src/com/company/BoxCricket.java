package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BoxCricket {

    private static Map<Integer, String> available_slots;
    private static Map<Integer, String> booked_slots;

    public BoxCricket() {
        available_slots = new HashMap<>();
        booked_slots = new HashMap<>();
        create_boxCricket_slots();
    }

    private static void create_boxCricket_slots() {
        for (int i = 1; i <= 5; i++) {
            int x =0;
            String time = " " + (9 + i) + ":00-" + (11 + i) + ":00";
            available_slots.put(i, time);
        }

    }

    public static void book_boxCricket_slot() {
        Scanner scanner = new Scanner(System.in);
        if (!available_slots.isEmpty()) {
            System.out.print("Enter your name: ");
            String name = scanner.next();
            System.out.println("These are the available slots for 'BoxCricket'");
            while (true) {
                System.out.println(available_slots);
                System.out.print("Enter your choice: ");
                boolean Integer = scanner.hasNextInt();
                if (Integer) {
                    int slot_timing = scanner.nextInt();
                    if (available_slots.containsKey(slot_timing)) {
                        String time = available_slots.get(slot_timing);
                        booked_slots.put(slot_timing, time);
                        available_slots.remove(slot_timing);
                        displayMessage(name, time);
                        break;
                    } else {
                        System.out.println("Sorry, we don't have empty slots at '"+booked_slots.get(slot_timing)+"' Choose from available slots");
                    }

                } else System.out.println("Please enter valid option");

            }
            scanner.nextLine();
        } else {
            System.out.println("Sorry :( we are full");
        }
    }

    private static void displayMessage(String name, String timing) {
        System.out.println(
                "yeah :) you have successfully booked a slot,\n" +
                        "Name: " + name +
                        "\nSport: boxCricket\n" +
                        "Timing: " + timing);
    }

    public static Map<Integer,String> getBooked_slots(){
        return booked_slots;
    }

    public static Map<Integer,String> getAvailable_slots(){
        return available_slots;
    }

}
