package com.netflix.sim;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.netflix.sim.catalog.Content;
import com.netflix.sim.user.Profile;
import com.netflix.sim.user.User;

public class Level2Test {
    @Test
    void createsUserWithProfilesAndWatchlists() {
        List<Content> seed = Level1.createSeedContent();
        User user = Level2.run(seed);

        assertEquals("U101", user.getUserId());
        assertEquals(2, user.getProfiles().size());

        Profile alice = user.getProfiles().get(0);
        Profile kiddo = user.getProfiles().get(1);

        assertEquals(2, alice.getWatchList().size(), "Alice should have 2 watchlist items");
        assertEquals(1, kiddo.getWatchList().size(), "Kiddo should have 1 watchlist item");
        assertTrue(alice.getPreferredGenres().contains("SciFi"));
    }
}
