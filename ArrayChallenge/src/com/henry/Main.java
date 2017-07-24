package com.henry;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    printArray(sortIntegers(getIntegers(5)));
    }

    public static int[] getIntegers(int numLength) {
        System.out.println("Give me " + numLength + " numbers");
        int[] array = new int[numLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < sortedArray.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;

//        int counter = 0;
//        boolean swapped = false;
//        int temp;
//        while (counter != sortedArray.length) {
//            if (counter == sortedArray.length - 1 && swapped == false) {
//                return sortedArray;
//            }
//            if (counter == sortedArray.length - 1) {
//                swapped = false;
//                counter = 0;
//                continue;
//            }
//            if (sortedArray[counter] < sortedArray[counter+1]) {
//                swapped = true;
//                temp = sortedArray[counter];
//                sortedArray[counter] = sortedArray[counter+1];
//                sortedArray[counter+1] = temp;
//            }
//            counter++;
//        }
//        return null;
    }
}
