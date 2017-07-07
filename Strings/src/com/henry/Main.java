package com.henry;

public class Main {

    public static void main(String[] args) {
        //primitive types
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "this is a string";
        myString = myString + ", and this is more." + " \u00A9 2015";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);
    }
}
