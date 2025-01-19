package com.smarthome.Main;

import com.smarthome.controller.HomeController;

public class SmartHomeSystem {
    public static void main(String[] args) {
        HomeController homeController = new HomeController();

        homeController.handleLighting(true);
        homeController.handleHeating(5);
        homeController.handleSecurity(true);

        homeController.handleLighting(false);
        homeController.handleHeating(-3);
        homeController.handleSecurity(false);
    }
}
