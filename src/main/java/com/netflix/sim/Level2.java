package com.netflix.sim;

import java.util.Arrays;
import java.util.List;

import com.netflix.sim.catalog.Content;
import com.netflix.sim.user.Profile;
import com.netflix.sim.user.User;

public class Level2 {
    public static User createUser(List<Content> seed) {
        Profile p1 = new Profile("Alice", "Adult", Arrays.asList("SciFi", "Drama"), null);
        Profile p2 = new Profile("Kiddo", "Child", Arrays.asList("Comedy"), null);
        p1.addToWatchList(seed.get(0));
        p1.addToWatchList(seed.get(2));
        p2.addToWatchList(seed.get(1));

        return new User("U101", "John", Arrays.asList(p1, p2));
    }

    public static User run(List<Content> seed) {
        System.out.println();
        System.out.println("-- Level 2: User Profiles & Watchlists --");
        User user = createUser(seed);
        user.displayProfiles();
        user.getProfiles().forEach(Profile::displayWatchList);
        return user;
    }
}
