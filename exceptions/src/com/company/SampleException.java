package com.company;

public class SampleException {

    public static void main(String[] args) {
        try {
            throw new MyException();
        }catch (Exception err){
            System.out.println("Caught you boi:"+err);
        }
    }
}
class MyException extends Exception {
    int a =10;
    int b = 0;

int c = a/b;

public void toStringMethod() throws Exception{
    System.out.println("result: "+c);

}
}