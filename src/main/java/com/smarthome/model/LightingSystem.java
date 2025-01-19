package com.smarthome.model;

public class LightingSystem {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Lighting: On");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Lighting: Off");
    }

    public boolean isOn() {
        return isOn;
    }
}