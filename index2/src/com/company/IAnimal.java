package com.company;

public interface IAnimal {
    String  eat();
    String run();
    String sleep();

    default String getAccess(){
        return "Depends on animal, whether it is a dog, cat or cow ";
    }
}
