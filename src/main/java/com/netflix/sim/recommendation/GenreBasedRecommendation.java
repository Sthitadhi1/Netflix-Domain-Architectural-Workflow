package com.netflix.sim.recommendation;

import com.netflix.sim.catalog.Catalog;
import com.netflix.sim.catalog.Content;
import com.netflix.sim.user.Profile;

import java.util.*;

public class GenreBasedRecommendation implements RecommendationStrategy {
    @Override
    public List<Content> recommend(Profile profile, Catalog catalog) {
        Set<String> prefs = new HashSet<>(profile.getPreferredGenres());
        List<Content> result = new ArrayList<>();
        for (Content c : catalog.listAll()) {
            if (prefs.contains(c.getGenre())) result.add(c);
        }
        return result;
    }
}
