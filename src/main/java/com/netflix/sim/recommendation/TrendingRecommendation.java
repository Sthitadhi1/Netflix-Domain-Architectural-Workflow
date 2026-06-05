package com.netflix.sim.recommendation;

import com.netflix.sim.catalog.Catalog;
import com.netflix.sim.catalog.Content;
import com.netflix.sim.user.Profile;

import java.util.*;

public class TrendingRecommendation implements RecommendationStrategy {
    @Override
    public List<Content> recommend(Profile profile, Catalog catalog) {
        // Simplified: trending = first 3 items
        List<Content> all = catalog.listAll();
        return all.subList(0, Math.min(3, all.size()));
    }
}
