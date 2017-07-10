package com.henry;

public class Main {

    public static void main(String[] args) {
        int switchValue = 1;
        // byte, short, char, int
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Was a 3, 4, or 5");
                System.out.println("Actually it was a "+ switchValue);
                break;
            default:
                System.out.println("Was not 1,2,3,4,5");
                break;
        }

        char test = 'G';
        switch(test) {
            case 'A':
                System.out.println("Found A");
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C':case 'D':case 'E':
                System.out.println("Found " + test);
                break;
            default:
                System.out.println("Could not find ABCDE");
                break;
        }

        String month = "JUnE";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

    }
}
