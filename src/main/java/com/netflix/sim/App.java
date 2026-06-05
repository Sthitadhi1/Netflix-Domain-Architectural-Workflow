package com.netflix.sim;

import java.util.List;

import com.netflix.sim.catalog.Catalog;
import com.netflix.sim.catalog.Content;
import com.netflix.sim.user.Profile;
import com.netflix.sim.user.User;

public class App {
    public static void main(String[] args) {
        List<Content> seed = Level1.createSeedContent();
        Catalog catalog = Level1.buildCatalog();
        Level1.run(catalog);

        User user = Level2.run(seed);
        Profile profile = user.getProfiles().get(0);

        Level3.run();
        Level4.run(profile, catalog);
        Level5.run(profile, seed);

        System.out.println();
        System.out.println("Demo complete.");
    }
}
