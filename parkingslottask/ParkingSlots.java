package parkingslottask;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import static javax.swing.UIManager.get;

public class ParkingSlots {
    enum Vehicle {
        BIKE, CAR;
    }

    private Map<Vehicle, LinkedList<String>> avail_map;
    private Map<Vehicle, LinkedList<String>> booked_map;
    private LinkedList<String> bikeLinkedList;
    private LinkedList<String> carLinkedList;
    private LinkedList<String> bookedBikeLinkedList;
    private LinkedList<String> bookedCarLinkedList;


    public ParkingSlots() {
        this.bikeLinkedList = new LinkedList<>();
        this.carLinkedList = new LinkedList<>();
        this.bookedBikeLinkedList = new LinkedList<>();
        this.bookedCarLinkedList = new LinkedList<>();

        this.avail_map = new HashMap<>();
        this.booked_map = new HashMap<>();
        for (int i = 1; i <= 15; i++) {
            bikeLinkedList.add(String.format('B' + "%02d", i));
        }
        for (int i = 16; i <= 30; i++) {
            carLinkedList.add(String.format('C' + "%02d", i));
        }

        avail_map.put(Vehicle.BIKE, bikeLinkedList);
        avail_map.put(Vehicle.CAR, carLinkedList);
        booked_map.put(Vehicle.BIKE, bookedBikeLinkedList);
        booked_map.put(Vehicle.CAR, bookedCarLinkedList);

    }

    public void bookSlot(Vehicle vehicle) {
        if (vehicle.equals(Vehicle.BIKE)) {
            if (!bikeLinkedList.isEmpty()) {
                Collections.sort(bikeLinkedList);
                String xString = bikeLinkedList.removeFirst();
                bookedBikeLinkedList.add(xString);
                System.out.println("Successfully booked " + xString);
            } else {
                System.out.println("Sorry, we don't have empty slots for 'BIKES'");
            }
        } else {
            if (!carLinkedList.isEmpty()) {
                String yString = carLinkedList.removeFirst();
                bookedCarLinkedList.add(yString);
                System.out.println("Successfully booked " + yString);
            } else {
                System.out.println("Sorry, we don't have empty slots for 'CARS'");

            }
        }
    }

    public void getAvailableSlot(Vehicle vehicle) {
        LinkedList<String> linkedList = avail_map.get(vehicle);
        Collections.sort(linkedList);
        for (String string : linkedList) {
            System.out.print("'" + string + "' ");
        }
        System.out.print("\n");
    }

    public void getBookedSlot(Vehicle vehicle) {
        LinkedList<String> linkedList = booked_map.get(vehicle);
        Collections.sort(linkedList);
        for (String string : linkedList) {
            System.out.print("'" + string + "' ");
        }
        System.out.print("\n");
    }

    public void releaseSlot(Vehicle vehicle, String slot_no) {
        if (booked_map.get(vehicle).remove(slot_no.toUpperCase())) {
            avail_map.get(vehicle).add(slot_no.toUpperCase());
            System.out.println("you're good to go");
        } else {
            System.out.println("Enter slot_no is either not correct or it has not been booked yet");
        }
//        String fl = slot_no.substring(0,1);
//        if(fl.equalsIgnoreCase("B")){
//            if(bookedBikeLinkedList.contains(slot_no)){
//                bookedBikeLinkedList.remove(slot_no);
//            }else{
//                System.out.println("Entered slot_no is either not booked or invalid");
//            }
//        }else if(fl.equalsIgnoreCase("C")){
//            if(bookedCarLinkedList.contains(slot_no)){
//                bookedCarLinkedList.remove(slot_no);
//            }else{
//                System.out.println("Entered slot_no is either not booked or invalid");
//            }
//        }
    }
}