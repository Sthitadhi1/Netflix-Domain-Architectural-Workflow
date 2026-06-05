package com.netflix.sim.catalog;

import java.util.*;

public class Catalog {
    private final List<Content> contents;

    public Catalog(List<Content> initialContents) {
        this.contents = new ArrayList<>(initialContents != null ? initialContents : Collections.emptyList());
    }

    public void addContent(Content c) { contents.add(c); }

    public Optional<Content> searchByTitle(String title) {
        return contents.stream()
                .filter(c -> c.getTitle().equalsIgnoreCase(title))
                .findFirst();
    }

    public boolean removeById(String id) {
        return contents.removeIf(c -> c.getContentId().equals(id));
    }

    public List<Content> listAll() { return Collections.unmodifiableList(contents); }

    public void displayAll() {
        System.out.println("Catalog contents:");
        for (Content c : contents) System.out.println(" - " + c);
    }
}
