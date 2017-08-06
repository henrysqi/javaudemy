package com.henry;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone timsPhone;
//        DeskPhone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(23565);
         timsPhone.powerOn();
        timsPhone.callPhone(23565);
        timsPhone.answer();
    }
}
