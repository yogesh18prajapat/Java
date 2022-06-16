package com.company;

public class LifeCycleOfThread extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e);
        }

    }

}
