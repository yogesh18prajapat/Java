package com.company;

public class MyEnum {
    public static void main(String[] args) {
        System.out.println("\n enum Color");
        for(Color x : Color.values()){
            x.info();
        }

        System.out.println("\n enum Months");
        Months[] x = Months.values();

    }

}

enum Color{
    RED{
        public void info(){
            System.out.println("red is called");
        }
    },GREEN,BLUE;


    public void info(){
        System.out.println("Universal color");
    }
}
enum Months {
    JANUARY(1),FEBRUARY(2),MARCH(3),DECEMBER;

    int month;
    Months(int month){
        System.out.println("Constructor with parameters");
        this.month = month;
    }
    Months(){
        System.out.println("empty Constructor");
        this.month = 0;
    }
    public int getMonth(){
        return this.month;
    }
}
