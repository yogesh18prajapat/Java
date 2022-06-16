package com.company;


import java.io.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args){
        try {
            FileWriter file = new FileWriter("testFile1.txt",true);
//            String string = "ha ha ha got you ";
//            file.write(string);
//            file.append("Appended word");
//            file.write(" appended child");
//            file.close();

            File f1 = new File("testFile1.txt");
            FileReader f11 = new FileReader(f1);
            BufferedReader file2 = new BufferedReader(f11);
            PrintWriter file3 = new PrintWriter("testFile2.txt");
            String received = file2.readLine();
            while(received != null){
                System.out.println(received);
                file3.println(received);
                received = file2.readLine();
            }
            file2.close();
            file3.close();
            System.out.println(f1.isHidden());
            System.out.println(f1.lastModified());

//            Process p = Runtime.getRuntime().exec("attrib +H "+f1.getPath());
//            p.waitFor(10,TimeUnit.SECONDS);
//            System.out.println(f1.isHidden());
////            System.out.println(f1.getName());
//
////            Process p2 = Runtime.getRuntime().exec("attrib -H "+f1.getPath());
//            System.out.println(f1.isHidden());

            long time= f1.lastModified();
            System.out.println(new Date(time));
        }catch (Exception e){
            System.out.println("File is hidden");
            System.out.println(e);
        }finally {
            System.out.println("Got some exceptions");
        }

    }
}
