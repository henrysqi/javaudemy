package com.henry;

public class Main {

    public static void main(String[] args) {
//        int count = 0;
//        while (count != 6) {
//            System.out.println(count);
//            count++;
//        }
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println(count);
//            count++;
//        }
//        count = 6;
//        do {
//            System.out.println(count);
//            count++;
//            if (count > 100) {
//                break;
//            }
//        } while (count != 6);

        int number = 5;
        int finishNumber = 20;
        int count = 0;
        while (number <= finishNumber) {
            if (count == 5) {
                break;
            }
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            number++;
            count++;
        }
        System.out.println("total found: " + count);

    }
    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
