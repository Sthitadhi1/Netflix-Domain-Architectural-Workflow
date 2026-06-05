package com.netflix.sim.recommendation;

import com.netflix.sim.catalog.Catalog;
import com.netflix.sim.catalog.Content;
import com.netflix.sim.user.Profile;

import java.util.List;

public class RecommendationEngine {
    private RecommendationStrategy strategy;

    public RecommendationEngine(RecommendationStrategy strategy) { this.strategy = strategy; }

    public void setStrategy(RecommendationStrategy strategy) { this.strategy = strategy; }

    public List<Content> recommend(Profile profile, Catalog catalog) {
        return strategy.recommend(profile, catalog);
    }
}
