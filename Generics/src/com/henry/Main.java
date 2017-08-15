package com.henry;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
//        items.add("tim");
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }
}
