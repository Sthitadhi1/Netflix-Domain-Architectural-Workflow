package com.netflix.sim.devices;

import com.netflix.sim.catalog.Content;
import com.netflix.sim.user.Profile;

public class StreamingSession {
    private final Profile profile;
    private final PlayableDevice device;
    private final Content content;

    public StreamingSession(Profile profile, PlayableDevice device, Content content) {
        this.profile = profile;
        this.device = device;
        this.content = content;
    }

    public void start() {
        System.out.println("Starting session for " + profile.getProfileName() + " on device " + device.getDeviceId());
        device.play(content);
        profile.recordWatch(content);
    }

    public void pause() { device.pause(); }
    public void stop() { device.stop(); }
}
