package com.henry;

public class Main {

    public static void main(String[] args) {
        byte byteVar = 100;
        short shortVar = 5000;
        int intVar = 12425;
        long longVar = 50000+10*(byteVar+shortVar+intVar);
        System.out.println(longVar);
    }
}
