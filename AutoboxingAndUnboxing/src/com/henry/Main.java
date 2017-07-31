package com.henry;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.23);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
//        for (int i = 0; i <= 10; i++) {
//            integerArrayList.add(Integer.valueOf(i)); //autoboxing
//        }
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
//        }


        Integer myIntValue = 56; // Integer myIntValue = Integer.valueOf(56);
        int myInt = myIntValue; // int myInt = myIntValue.intValue();

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
//            doubleArrayList.add(Double.valueOf(dbl));
            doubleArrayList.add(dbl);
        }
        for (int i = 0; i < doubleArrayList.size(); i++) {
//            double value = doubleArrayList.get(i).doubleValue();
            double value = doubleArrayList.get(i);
            System.out.println(i + "--->" + value);
        }
    }
}
