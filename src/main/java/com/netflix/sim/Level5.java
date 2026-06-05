package com.netflix.sim;

import java.util.List;

import com.netflix.sim.catalog.Content;
import com.netflix.sim.devices.DeviceManager;
import com.netflix.sim.devices.GamingConsole;
import com.netflix.sim.devices.LaptopDevice;
import com.netflix.sim.devices.MobileDevice;
import com.netflix.sim.devices.PlayableDevice;
import com.netflix.sim.devices.SmartTV;
import com.netflix.sim.devices.StreamingSession;
import com.netflix.sim.user.Profile;

public class Level5 {
    public static void run(Profile profile, List<Content> seed) {
        System.out.println();
        System.out.println("-- Level 5: Streaming Ecosystem --");

        DeviceManager dm = new DeviceManager();
        PlayableDevice tv = new SmartTV("TV-01");
        PlayableDevice phone = new MobileDevice("M-01");
        PlayableDevice laptop = new LaptopDevice("L-01");
        PlayableDevice console = new GamingConsole("G-01");
        dm.registerDevice(tv);
        dm.registerDevice(phone);
        dm.registerDevice(laptop);
        dm.registerDevice(console);

        dm.listDevices();
        System.out.println("Active device count: " + dm.activeDeviceCount());

        dm.findById("L-01").ifPresent(device -> {
            StreamingSession session = new StreamingSession(profile, device, seed.get(1));
            session.start();
            session.pause();
            session.stop();
        });
    }
}
