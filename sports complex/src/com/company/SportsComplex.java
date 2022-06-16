package com.company;


import java.util.Map;
import java.util.Scanner;

public class SportsComplex {


    public static void SC() throws Exception {
        Scanner sc = new Scanner(System.in);

        Badminton b = new Badminton();
        Football f = new Football();
        BoxCricket bc = new BoxCricket();

        boolean book = true;
        while (book) {
            System.out.println("Select a sport:\n" +
                    "1.Badminton\n" +
                    "2.football\n" +
                    "3.BoxCricket");
            boolean hasInt = sc.hasNextInt();
            if (hasInt) {
                int option = sc.nextInt();
                if (!(option < 1 || option > 3)) {
                    switch (option) {

                        case 1:
                            Badminton.book_Badminton_slot();
                            System.out.println("Press 'Y' to book more.");
                            String x = sc.next();
                            book = x.equalsIgnoreCase("y");
                            break;
                        case 2:
                            Football.book_football_slot();
                            System.out.println("Press 'Y' to book more.");
                            String y = sc.next();
                            book = y.equalsIgnoreCase("y");
                            break;
                        case 3:
                            BoxCricket.book_boxCricket_slot();
                            System.out.println("Press 'Y' to book more.");
                            String z = sc.next();
                            book = z.equalsIgnoreCase("y");
                            break;
                    }
                }
//                else {
//                    throw new Exception("Enter only available options");
//                }
            }            sc.nextLine();

//            throw new Exception("Enter only available options");


//        }
//            for (Map.Entry<Integer, String> i : BoxCricket.getAvailable_slots().entrySet()) {
//                System.out.println(i);
//            }
        }
    }
}


