package com.example.movieapp;

import java.util.List;

public class Movie {
    private String title;
    private String genre;
    private float rating;
    private String description;
    private int posterResId;
    private List<Actor> actors;

    public Movie(String title, String genre, float rating, String description, int posterResId, List<Actor> actors) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.description = description;
        this.posterResId = posterResId;
        this.actors = actors;
    }

    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public float getRating() { return rating; }
    public String getDescription() { return description; }
    public int getPosterResId() { return posterResId; }
    public List<Actor> getActors() { return actors; }
}
