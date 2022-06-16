package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Employee  {
    private   File file;
    private  FileReader fileReader;


    public Employee() throws IOException{

    }

    public  void createFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        if(Pattern.matches("/.",x)) {
            file = new File(x);
        }else {
            file = new File(x+".txt");
        }
        if (file.createNewFile()) {
            System.out.println(file.getName() + " created successfully");
        } else {
            System.out.println(file.getName() + " already exists");
        }
        fileReader = new FileReader(file);
    }

    public  void writeFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(file);
        String output = scanner.nextLine();
        printWriter.println(output);
        printWriter.flush();
        printWriter.close();
        file.setWritable(false);
    }

    public  void readFile() throws IOException{
        BufferedReader br = new BufferedReader(fileReader);
        String input = br.readLine();
        System.out.println(input);
        br.close();
    }

}
