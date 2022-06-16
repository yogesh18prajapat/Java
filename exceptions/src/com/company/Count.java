package com.company;

public class Count {
    public static void main(String[] args) {
        int num = 1978363;
        int count = 0;
        while(num >0){
            num /= 10;
            count++;
        }
        System.out.println(count);

//        int value[] = new int[]{1,2,3,4,5};
//        System.out.println(value.length);

//        String val = "123456";
//        System.out.println(val.length());
    }
}
