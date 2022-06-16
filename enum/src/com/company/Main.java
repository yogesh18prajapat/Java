package com.company;

public class Main {
    enum Color {
        RED {
            public void info() {
                System.out.println("red is called");
            }
        }, GREEN, BLUE;

        public void info(){
            System.out.println("Common colors");
        }
    }


    public static void main(String[] args) {

        for(Color x : Color.values()){
            x.info();
        }


    }
}
