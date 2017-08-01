package com.henry;

import java.util.ArrayList;

/**
 * Created by Henry on 7/31/2017.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount); // autoboxing
    }
}
