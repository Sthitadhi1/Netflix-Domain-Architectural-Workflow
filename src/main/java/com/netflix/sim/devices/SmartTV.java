package com.netflix.sim.devices;

import com.netflix.sim.catalog.Content;

public class SmartTV implements PlayableDevice {
    private final String deviceId;

    public SmartTV(String deviceId) { this.deviceId = deviceId; }

    @Override public String getDeviceId() { return deviceId; }
    @Override public void play(Content content) { System.out.println("[SmartTV " + deviceId + "] Playing: " + content); }
    @Override public void pause() { System.out.println("[SmartTV " + deviceId + "] Paused"); }
    @Override public void stop() { System.out.println("[SmartTV " + deviceId + "] Stopped"); }
}
