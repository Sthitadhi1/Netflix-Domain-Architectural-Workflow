package com.netflix.sim.devices;

import com.netflix.sim.catalog.Content;

public class LaptopDevice implements PlayableDevice {
    private final String deviceId;

    public LaptopDevice(String deviceId) { this.deviceId = deviceId; }

    @Override public String getDeviceId() { return deviceId; }
    @Override public void play(Content content) { System.out.println("[Laptop " + deviceId + "] Playing in browser: " + content); }
    @Override public void pause() { System.out.println("[Laptop " + deviceId + "] Paused"); }
    @Override public void stop() { System.out.println("[Laptop " + deviceId + "] Stopped"); }
}
