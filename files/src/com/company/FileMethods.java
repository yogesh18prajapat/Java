package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileMethods {

    public static void main(String[] args){
        try {
            File myObj = new File("filename6.txt");
//        if (myObj.exists()) {
            FileWriter file = new FileWriter(myObj);
            file.write("I can write whatever i want");
            file.close();
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
//            boolean canWrite = myObj.setWritable(false);
//            System.out.println("Writeable after setWrite(false): " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
//            boolean canRead = myObj.setReadable(true);
//            System.out.println("Readable after setReadable(true): " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
//        } else {
//            System.out.println("The file does not exist.");
//        }
        }
        catch (IOException ioe) {
            System.out.println(ioe);
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }

        File obj =  new File("D:\\yogesh\\java new\\untitled");
        String[] fileNames =obj.list();
        assert fileNames != null;
        for(String file : fileNames){
            System.out.println(file);
        }


    }
}
