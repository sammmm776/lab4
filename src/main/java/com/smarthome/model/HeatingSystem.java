package com.smarthome.model;

public class HeatingSystem {
    private int temperature;

    public HeatingSystem() {
        this.temperature = 20;
    }

    public void increaseTemperature(int value) {
        temperature += value;
        System.out.println("Heating: The temperature is increased to " + temperature + "°C");
    }

    public void decreaseTemperature(int value) {
        temperature -= value;
        System.out.println("Heating: The temperature is reduced to " + temperature + "°C");
    }

    public int getTemperature() {
        return temperature;
    }
}