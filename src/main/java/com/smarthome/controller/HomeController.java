package com.smarthome.controller;

public class HomeController {
    private final com.smarthome.controller.CentralController centralController;

    public HomeController() {
        this.centralController = com.smarthome.controller.CentralController.getInstance();
    }

    public void handleLighting(boolean turnOn) {
        if (turnOn) {
            centralController.getLightingSystem().turnOn();
        } else {
            centralController.getLightingSystem().turnOff();
        }
    }

    public void handleHeating(int changeTemperature) {
        if (changeTemperature > 0) {
            centralController.getHeatingSystem().increaseTemperature(changeTemperature);
        } else {
            centralController.getHeatingSystem().decreaseTemperature(-changeTemperature);
        }
    }

    public void handleSecurity(boolean enableAlarm) {
        if (enableAlarm) {
            centralController.getSecuritySystem().enableAlarm();
        } else {
            centralController.getSecuritySystem().disableAlarm();
        }
    }
}