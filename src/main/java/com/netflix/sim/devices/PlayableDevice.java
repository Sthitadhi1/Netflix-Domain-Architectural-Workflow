package com.netflix.sim.devices;

import com.netflix.sim.catalog.Content;

public interface PlayableDevice {
    String getDeviceId();
    void play(Content content);
    void pause();
    void stop();
}
