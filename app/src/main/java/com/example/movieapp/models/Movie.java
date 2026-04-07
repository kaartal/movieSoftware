package com.example.movieapp.models;

import java.util.List;

public class Movie {
    private int id;
    private String title;
    private String genre;
    private int year;
    private float rating;
    private String description;
    private String posterUrl;   // URL slike postera (TMDB)
    private List<Actor> actors;

    public Movie(int id, String title, String genre, int year, float rating,
                 String description, String posterUrl, List<Actor> actors) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
        this.description = description;
        this.posterUrl = posterUrl;
        this.actors = actors;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getYear() { return year; }
    public float getRating() { return rating; }
    public String getDescription() { return description; }
    public String getPosterUrl() { return posterUrl; }
    public List<Actor> getActors() { return actors; }
}
