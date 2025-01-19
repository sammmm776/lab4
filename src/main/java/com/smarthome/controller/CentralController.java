package com.smarthome.controller;

import com.smarthome.model.LightingSystem;
import com.smarthome.model.HeatingSystem;
import com.smarthome.model.SecuritySystem;

public class CentralController {
    private static CentralController instance;

    private final LightingSystem lightingSystem;
    private final HeatingSystem heatingSystem;
    private final SecuritySystem securitySystem;

    private CentralController() {
        lightingSystem = new LightingSystem();
        heatingSystem = new HeatingSystem();
        securitySystem = new SecuritySystem();
    }

    public static CentralController getInstance() {
        if (instance == null) {
            instance = new CentralController();
        }
        return instance;
    }

    public LightingSystem getLightingSystem() {
        return lightingSystem;
    }

    public HeatingSystem getHeatingSystem() {
        return heatingSystem;
    }

    public SecuritySystem getSecuritySystem() {
        return securitySystem;
    }
}