package com.netflix.sim.user;

import com.netflix.sim.catalog.Content;

import java.util.*;

public class Profile {
    private final String profileName;
    private final String ageCategory;
    private final List<Content> watchList;
    private final List<String> preferredGenres;
    private final List<Content> viewingHistory;

    public Profile(String profileName, String ageCategory, List<String> preferredGenres, List<Content> initialWatchList) {
        this.profileName = profileName;
        this.ageCategory = ageCategory;
        this.preferredGenres = new ArrayList<>(preferredGenres != null ? preferredGenres : Collections.emptyList());
        this.watchList = new ArrayList<>(initialWatchList != null ? initialWatchList : Collections.emptyList());
        this.viewingHistory = new ArrayList<>();
    }

    public String getProfileName() { return profileName; }
    public String getAgeCategory() { return ageCategory; }
    public List<String> getPreferredGenres() { return Collections.unmodifiableList(preferredGenres); }
    public List<Content> getWatchList() { return Collections.unmodifiableList(watchList); }
    public List<Content> getViewingHistory() { return Collections.unmodifiableList(viewingHistory); }

    public void addToWatchList(Content c) { watchList.add(c); }
    public boolean removeFromWatchList(Content c) { return watchList.remove(c); }
    public void displayWatchList() {
        System.out.println("Watchlist for " + profileName + ":");
        for (Content c : watchList) System.out.println(" - " + c);
    }

    public void recordWatch(Content c) { viewingHistory.add(c); }
}
