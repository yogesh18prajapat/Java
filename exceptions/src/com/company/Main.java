package com.company;

public class Main {

    public static void main(String[] args) {
try { //Main try method
    try { //Nested try method
        int[] array = new int[]{0, 1, 2, 3, 4};
        array[9] = 10;
    } catch (Exception err) {
        System.out.print("error: ");
        System.out.println(err.getMessage());
    }
    try { //Nested try method
        int num = Integer.parseInt("parsing");
    } catch (Exception err) {
        System.out.print("error: ");
        System.out.println(err.getMessage());
    }
    //Code in main try method
    int a = 10;
    int b = 20;
    int c = a / 0;
    System.out.println(c);

}catch (Exception err){ //This will catch exceptions if we have any in main Try method
    System.out.println("error: "+err);
}
//Ths will be executed even if we have exception
        int a = 10;
        int b = 20;
        int c = a*b;
        System.out.println("result "+c);
    }
}
