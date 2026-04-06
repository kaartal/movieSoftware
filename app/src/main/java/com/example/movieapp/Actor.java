package com.example.movieapp;

public class Actor {
    private String name;
    private int photoResId;

    public Actor(String name, int photoResId) {
        this.name = name;
        this.photoResId = photoResId;
    }

    public String getName() { return name; }
    public int getPhotoResId() { return photoResId; }
}
