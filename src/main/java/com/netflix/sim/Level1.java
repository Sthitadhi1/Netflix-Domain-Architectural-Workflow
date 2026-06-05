package com.netflix.sim;

import java.util.Arrays;
import java.util.List;

import com.netflix.sim.catalog.Catalog;
import com.netflix.sim.catalog.Content;

public class Level1 {
    public static List<Content> createSeedContent() {
        return Arrays.asList(
                new Content("C001", "Drama", "The Trial", 120),
                new Content("C002", "Comedy", "Funny Business", 90),
                new Content("C003", "SciFi", "Starscape", 140),
                new Content("C004", "Documentary", "Planet Earth X", 60)
        );
    }

    public static Catalog buildCatalog() {
        return new Catalog(createSeedContent());
    }

    public static void run(Catalog catalog) {
        System.out.println("-- Level 1: Content Catalog --");
        catalog.displayAll();
    }
}
