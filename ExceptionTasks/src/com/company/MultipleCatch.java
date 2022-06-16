package com.company;

public class MultipleCatch {
    public static void main(String[] args) {

        try {
            int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            a[11] = Integer.parseInt("");
            a[10] = 10;
            int c = a[10] / 0;
        }catch (ArithmeticException err){
            System.out.println(err);
        }catch (IndexOutOfBoundsException err){
            System.out.println(err);
        }catch (NumberFormatException err){
            System.out.println(err);
        }catch (Exception e){
            System.out.println(e);
        }
        //It doesn't matter which catch method we define first.
        //In this the first exception found was NumberFormatException, so it will search for that catch method
    }
}
