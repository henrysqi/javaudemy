package com.henry;

/**
 * Created by hqi on 7/11/17.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("bob", 1000, "bob@bob.com");
    }
    public VipCustomer(String name, String email) {
        this(name, 100000, email);
    }
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

