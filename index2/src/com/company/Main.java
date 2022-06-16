package com.company;

public class Main {

    public static void main(String[] args) {

        IAnimal animal;

        Cow cow = new Cow();
        Cat cat = new Cat();

        System.out.println(cow.getAccess()); //gwtAccess() is declared in IAnimal Interface.
        //I can access the static methods through child class objects..
        System.out.println(cow.eat()); //eat() ia a method from Dog class.
        // I can access Dog class method through Cow objects.
        System.out.println(cat.run()); //run() method is declared in IAnimal and instantiated in Dog
        //Cow extends Dog so Cow can get access for Dog methods and Cat extends Cow, so it can also access all from Dog




    }
}
