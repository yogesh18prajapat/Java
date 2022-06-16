package com.company;

public class Test {

    private void welcome(String name, String address) throws  Exception{
        if(!name.equals("")) {
            System.out.println("Hello! :) " + name +" "+ address);
        }else{
            System.out.println("Stranger stranger Go away");
        }
    }


}
