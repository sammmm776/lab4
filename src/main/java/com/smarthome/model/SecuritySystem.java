package com.smarthome.model;

public class SecuritySystem {
    private boolean alarmOn;

    public void enableAlarm() {
        alarmOn = true;
        System.out.println("Security: The alarm is on");
    }

    public void disableAlarm() {
        alarmOn = false;
        System.out.println("Security: The alarm is off");
    }

    public boolean isAlarmOn() {
        return alarmOn;
    }
}
