package com.netflix.sim.user;

import java.util.*;

public class User {
    private final String userId;
    private final String name;
    private final List<Profile> profiles;

    public User(String userId, String name, List<Profile> profiles) {
        this.userId = userId;
        this.name = name;
        this.profiles = new ArrayList<>(profiles != null ? profiles : Collections.emptyList());
    }

    public String getUserId() { return userId; }
    public String getName() { return name; }
    public List<Profile> getProfiles() { return Collections.unmodifiableList(profiles); }

    public void addProfile(Profile p) { if (profiles.size() < 5) profiles.add(p); else System.out.println("Max profiles reached"); }
    public boolean removeProfile(Profile p) { return profiles.remove(p); }
    public void displayProfiles() {
        System.out.println("User " + name + " profiles:");
        for (Profile p : profiles) System.out.println(" - " + p.getProfileName());
    }
}
