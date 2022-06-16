package com.company;

import java.util.StringJoiner;

public class StringJoinerEx {

    public static void main(String[] args) {
        StringJoiner x = new StringJoiner("$");
        x.add("one");
        x.add("two");
        x.add("three");
        x.add("four");
        System.out.println(x);

        StringJoiner y = new StringJoiner(" ","Prefix "," Suffix");
        y.add("one");
        y.add("two");
        //if you mention null then null will be displayed.
//        y.add(null);
        y.add("three");
        y.add("four");
        System.out.println(y.length());


        StringJoiner z = new StringJoiner("$");
        z.add("one");
        z.add("two");
        // setEmptyValue(charSequence emptyValue), this method sets StringJoiner value
        // to defined emptyValue only if stringJoiner is empty.
        z.setEmptyValue("0");
        System.out.println(z);


        StringJoiner joiner1 = new StringJoiner(" ");
        joiner1.add("one");
        joiner1.add("two");

        StringJoiner joiner2 = new StringJoiner(" ","Prefix2 "," Suffix2");
        joiner2.add("one");
        joiner2.add("two");


        StringJoiner stringJoiner = joiner1.merge(joiner2);
        //converting StringJoiner to String using toString() method;
        String string = stringJoiner.toString();
        System.out.println("charAt(2): "+string.charAt(2));
        stringJoiner.add("added");
        System.out.println(string);
        System.out.println(stringJoiner);

    }

}
