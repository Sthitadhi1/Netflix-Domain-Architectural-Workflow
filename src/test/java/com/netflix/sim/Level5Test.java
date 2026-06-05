package com.netflix.sim;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.netflix.sim.catalog.Content;
import com.netflix.sim.devices.DeviceManager;
import com.netflix.sim.devices.PlayableDevice;
import com.netflix.sim.devices.StreamingSession;
import com.netflix.sim.user.Profile;
import com.netflix.sim.user.User;

public class Level5Test {
    @Test
    void deviceManagerRegistersAndStreamsWithSession() {
        List<Content> seed = Level1.createSeedContent();
        User user = Level2.createUser(seed);
        Profile profile = user.getProfiles().get(0);

        DeviceManager dm = new DeviceManager();
        PlayableDevice tv = new com.netflix.sim.devices.SmartTV("TV-01");
        PlayableDevice laptop = new com.netflix.sim.devices.LaptopDevice("L-01");
        dm.registerDevice(tv);
        dm.registerDevice(laptop);

        assertEquals(2, dm.activeDeviceCount());
        assertTrue(dm.findById("L-01").isPresent());

        StreamingSession session = new StreamingSession(profile, laptop, seed.get(1));
        session.start();
        assertEquals(1, profile.getViewingHistory().size(), "Streaming session should record watched content");
    }
}
