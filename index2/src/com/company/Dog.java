package com.company;

abstract class Dog implements IAnimal{


    @Override

    public String eat() {
        return "Dog eat() method is called.....";
    }

    @Override
    public String run() {
        return "Dog run() method is called.......";
    }

    @Override
    public String sleep() {
        return "Dog sleep() method is called.......";
    }
}
