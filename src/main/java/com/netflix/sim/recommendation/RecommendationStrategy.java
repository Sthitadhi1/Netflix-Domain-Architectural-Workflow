package com.netflix.sim.recommendation;

import com.netflix.sim.catalog.Content;
import com.netflix.sim.user.Profile;

import java.util.List;

public interface RecommendationStrategy {
    List<Content> recommend(Profile profile, com.netflix.sim.catalog.Catalog catalog);
}
