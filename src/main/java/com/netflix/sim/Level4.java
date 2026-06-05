package com.netflix.sim;

import java.util.List;

import com.netflix.sim.catalog.Catalog;
import com.netflix.sim.catalog.Content;
import com.netflix.sim.recommendation.GenreBasedRecommendation;
import com.netflix.sim.recommendation.RecommendationEngine;
import com.netflix.sim.recommendation.TrendingRecommendation;
import com.netflix.sim.recommendation.WatchHistoryRecommendation;
import com.netflix.sim.user.Profile;

public class Level4 {
    public static void run(Profile profile, Catalog catalog) {
        System.out.println();
        System.out.println("-- Level 4: Recommendation Engine --");

        RecommendationEngine engine = new RecommendationEngine(new GenreBasedRecommendation());
        List<Content> genreRecs = engine.recommend(profile, catalog);
        System.out.println("Genre-based recommendations for " + profile.getProfileName() + ": " + genreRecs);

        engine.setStrategy(new TrendingRecommendation());
        System.out.println("Trending recommendations: " + engine.recommend(profile, catalog));

        engine.setStrategy(new WatchHistoryRecommendation());
        System.out.println("Watch-history recommendations: " + engine.recommend(profile, catalog));
    }
}
