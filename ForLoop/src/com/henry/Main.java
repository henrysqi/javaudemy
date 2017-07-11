package com.henry;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000, 2));
        for (int i = 2; i < 9; i++) {
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
        }
        System.out.println("*******");
        for (int i = 8; i > 1; i--) {
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
        }
        System.out.println("******");
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
                if (count == 10) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * interestRate / 100);
    }
}
