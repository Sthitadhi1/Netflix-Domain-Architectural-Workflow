package com.netflix.sim.devices;

import java.util.*;

public class DeviceManager {
    private final List<PlayableDevice> devices = new ArrayList<>();

    public void registerDevice(PlayableDevice d) { devices.add(d); }
    public boolean removeDevice(PlayableDevice d) { return devices.remove(d); }

    public Optional<PlayableDevice> findById(String id) {
        return devices.stream().filter(d -> d.getDeviceId().equals(id)).findFirst();
    }

    public int activeDeviceCount() { return devices.size(); }
    public void listDevices() {
        System.out.println("Registered devices:");
        for (PlayableDevice d : devices) System.out.println(" - " + d.getDeviceId());
    }
}
