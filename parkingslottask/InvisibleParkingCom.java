package parkingslottask;

import parkingslottask.ParkingSlots.Vehicle;

import java.util.Scanner;

public class InvisibleParkingCom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingSlots ps = new ParkingSlots();
        System.out.println("Press '0' to exit");
        boolean booking = true;
        while (booking) {
            System.out.println("To perform operations: \n press: \n 1. To Book slots \n 2. To release slot \n 3. To know Available Slots");
            String intake = sc.next();
            switch (intake) {
                case "1":
                    boolean x = true;
                    while (x) {
                        System.out.println("To select the vehicle type \n Press: \n 1. BIKE \n 2. CAR \n 3. more options");
                        String input = sc.next();
                        switch (input) {
                            case "1":
                                ps.bookSlot(Vehicle.BIKE);
                                break;
                            case "2":
                                ps.bookSlot(Vehicle.CAR);
                                break;

                            case "0":
                                System.out.println("Successfully completed the process");
                                x = false;
                                break;
                            default:
                                System.out.println("Enter valid input");
                        }
                        break;
                    }
                    break;
                case "2":
                    boolean a = true;
                    while (a) {
                        System.out.println("To select the vehicle type \n Press: \n 1. BIKE \n 2. CAR");
                        String input = sc.next();
                        switch (input) {
                            case "1":
                                System.out.println("Enter Slot_no");
                                String sl_no = sc.next();
                                ps.releaseSlot(Vehicle.BIKE, sl_no);
                                break;
                            case "2":
                                System.out.println("Enter Slot_no");
                                ps.releaseSlot(Vehicle.CAR, sc.next());
                                break;
                            case "0":
                                System.out.println("Successfully completed the process");
                                return;
//                                break;
                            default:
                                System.out.println("Enter valid input");
                                break;
                        }
                        break;
                    }
                    break;
                case "3":
                    System.out.println("select the vehicle type to know the available slots \n Press: \n 1. BIKE  \n 2. CAR ");
                    boolean y = true;
                    while (y) {
                        String input2 = sc.next();
                        switch (input2) {
                            case "1":
                                ps.getAvailableSlot(Vehicle.BIKE);
                                y = false;
                                break;
                            case "2":
                                ps.getAvailableSlot(Vehicle.CAR);
                                y = false;
                                break;
                            case "0":
                                System.out.println("Successfully completed the process");
                                return;
                            default:
                                System.out.println("Enter valid input");
                                y = true;
                        }
                    }
                    break;
                case "0":
                    booking = false;
                    break;
                default:
                    System.out.println("Enter valid input");
            }
        }

    }
}
