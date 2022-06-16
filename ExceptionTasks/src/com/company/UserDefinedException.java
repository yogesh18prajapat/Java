package com.company;

import java.util.Objects;
import java.util.Scanner;

public class UserDefinedException {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            access();
        }catch (myOwnException err){
            System.out.println(err.getMessage());
        }
    }

    static void access()throws myOwnException {
        System.out.println("Enter company name: \n");
        String company = scanner.next().toLowerCase();
        if(!company.equals("techouts")){
            throw new myOwnException();
        }else{
            System.out.println("Welcome");
        }
    }
}

class myOwnException extends Exception{
    myOwnException(){
        System.out.println("User access denied, " +
                "you are not a company employee");
    }
}

