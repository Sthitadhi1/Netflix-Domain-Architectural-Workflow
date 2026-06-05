package com.netflix.sim.recommendation;

import com.netflix.sim.catalog.Catalog;
import com.netflix.sim.catalog.Content;
import com.netflix.sim.user.Profile;

import java.util.*;

public class WatchHistoryRecommendation implements RecommendationStrategy {
    @Override
    public List<Content> recommend(Profile profile, Catalog catalog) {
        // Simplified: pick items not in history
        Set<String> seen = new HashSet<>();
        for (Content c : profile.getViewingHistory()) seen.add(c.getContentId());
        List<Content> result = new ArrayList<>();
        for (Content c : catalog.listAll()) if (!seen.contains(c.getContentId())) result.add(c);
        return result;
    }
}
