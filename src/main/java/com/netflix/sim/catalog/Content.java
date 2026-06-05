package com.netflix.sim.catalog;

public class Content {
    private final String contentId;
    private final String genre;
    private final String title;
    private final int durationMinutes;

    public Content(String contentId, String genre, String title, int durationMinutes) {
        this.contentId = contentId;
        this.genre = genre;
        this.title = title;
        this.durationMinutes = durationMinutes;
    }

    public String getContentId() { return contentId; }
    public String getGenre() { return genre; }
    public String getTitle() { return title; }
    public int getDurationMinutes() { return durationMinutes; }

    @Override
    public String toString() {
        return String.format("%s (%s) - %dmin [id=%s]", title, genre, durationMinutes, contentId);
    }
}
