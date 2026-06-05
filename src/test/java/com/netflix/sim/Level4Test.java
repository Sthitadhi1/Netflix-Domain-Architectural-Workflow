package com.netflix.sim;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.netflix.sim.catalog.Catalog;
import com.netflix.sim.catalog.Content;
import com.netflix.sim.recommendation.RecommendationEngine;
import com.netflix.sim.recommendation.TrendingRecommendation;
import com.netflix.sim.recommendation.WatchHistoryRecommendation;
import com.netflix.sim.user.User;

public class Level4Test {
    @Test
    void recommendationStrategiesProduceDifferentResults() {
        List<Content> seed = Level1.createSeedContent();
        Catalog catalog = Level1.buildCatalog();
        User user = Level2.createUser(seed);

        RecommendationEngine engine = new RecommendationEngine(new TrendingRecommendation());
        List<Content> trending = engine.recommend(user.getProfiles().get(0), catalog);
        assertEquals(3, trending.size(), "Trending strategy should return up to 3 items");

        engine.setStrategy(new WatchHistoryRecommendation());
        List<Content> watchHistory = engine.recommend(user.getProfiles().get(0), catalog);
        assertEquals(4, watchHistory.size(), "WatchHistoryRecommendation should return all unseen content when history is empty");
    }
}
