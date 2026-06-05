package com.netflix.sim.devices;

import com.netflix.sim.catalog.Content;

public class MobileDevice implements PlayableDevice {
    private final String deviceId;

    public MobileDevice(String deviceId) { this.deviceId = deviceId; }

    @Override public String getDeviceId() { return deviceId; }
    @Override public void play(Content content) { System.out.println("[Mobile " + deviceId + "] Playing (adaptive): " + content); }
    @Override public void pause() { System.out.println("[Mobile " + deviceId + "] Paused"); }
    @Override public void stop() { System.out.println("[Mobile " + deviceId + "] Stopped"); }
}
