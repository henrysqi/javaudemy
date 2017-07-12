package com.henry;

/**
 * Created by hqi on 7/11/17.
 */
public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        // can call one constructor from another constructor
        this("2341", 123, "default", "default address", "default phoen");
        // the above line must be the first line of constructor
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName,
                       String email, String phoneNumber) {
        System.out.println("constructyor called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("244", 200, customerName, email, phoneNumber);
    }

    public void deposit(double num) {
        this.balance += num;
        System.out.println(this.balance);
    }

    public void withdraw(double num) {
        if (this.balance - num < 0) {
            System.out.println("Not enough funds: " + this.balance);
        } else {
            this.balance -= num;
            System.out.println(this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
