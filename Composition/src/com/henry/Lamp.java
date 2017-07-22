package com.henry;

/**
 * Created by Henry on 7/20/2017.
 */
public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public void turnOn() {
        System.out.println("Lamp -> Turning On");
    }

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

}
