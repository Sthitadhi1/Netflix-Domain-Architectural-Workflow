package com.netflix.sim;

import static org.junit.jupiter.api.Assertions.*;

import com.netflix.sim.catalog.Catalog;
import com.netflix.sim.catalog.Content;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class Level1Test {
    @Test
    void createsCatalogWithSeedContent() {
        List<Content> seed = Level1.createSeedContent();
        assertEquals(4, seed.size(), "Seed content should contain 4 items");

        Catalog catalog = Level1.buildCatalog();
        assertEquals(4, catalog.listAll().size(), "Catalog should contain all seed items");

        Optional<Content> found = catalog.searchByTitle("Starscape");
        assertTrue(found.isPresent(), "Catalog should find content by title");
        assertEquals("C003", found.get().getContentId());
    }
}
