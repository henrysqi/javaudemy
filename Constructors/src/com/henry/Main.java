package com.henry;

public class Main {

    public static void main(String[] args) {
//        BankAccount joe = new BankAccount("123", 0, "sdfs", "123@f9u8e.com", "123-123-1231");
//        BankAccount joe = new BankAccount();
//        joe.setAccountNumber("123123");
//        joe.setBalance(0);
//        joe.setCustomerName("weiruh");
//        joe.setEmail("weoihf@asduo.com");
//        joe.setPhoneNumber("123-123-1233");

//        System.out.println(joe.getAccountNumber());
//        System.out.println(joe.getBalance());
//
//        joe.withdraw(100);
//        joe.deposit(50);
//        joe.withdraw(100);
//        joe.deposit(51);
//        joe.withdraw(100);
//
//        System.out.println("*******");
//
//        BankAccount tim = new BankAccount("tim", "time@eioud.com", "1231234");
//        System.out.println(tim.getAccountNumber());
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("asd", "asd@dsoihf.com");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("tasd", 9999, "213@#fa.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
    }
}
