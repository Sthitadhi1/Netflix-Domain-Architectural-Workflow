package com.netflix.sim.devices;

import com.netflix.sim.catalog.Content;

public class GamingConsole implements PlayableDevice {
    private final String deviceId;

    public GamingConsole(String deviceId) { this.deviceId = deviceId; }

    @Override public String getDeviceId() { return deviceId; }
    @Override public void play(Content content) { System.out.println("[Console " + deviceId + "] Playing (HDR): " + content); }
    @Override public void pause() { System.out.println("[Console " + deviceId + "] Paused"); }
    @Override public void stop() { System.out.println("[Console " + deviceId + "] Stopped"); }
}
