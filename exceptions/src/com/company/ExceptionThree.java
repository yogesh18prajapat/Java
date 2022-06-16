package com.company;

public class ExceptionThree {

    public static void main(String[] args) {

       validate(15);

    }

    static void validate(int age){
        try {

            if(age < 17) {
                throw new InvalidAgeException("Grow up kid");
            }else{
                System.out.println("All grown up");
            }
        }catch (InvalidAgeException err){

            System.out.println(err);
        }


    }
}

class InvalidAgeException extends Exception{

    public InvalidAgeException(String error){
        super(error);
    }


}
