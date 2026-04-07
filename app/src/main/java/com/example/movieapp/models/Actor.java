package com.example.movieapp.models;

public class Actor {
    private String name;
    private String role;       // uloga u filmu
    private String nationality;
    private int birthYear;
    private String biography;
    private String photoUrl;   // URL fotografije glumca (TMDB profile)

    public Actor(String name, String role, String nationality,
                 int birthYear, String biography, String photoUrl) {
        this.name = name;
        this.role = role;
        this.nationality = nationality;
        this.birthYear = birthYear;
        this.biography = biography;
        this.photoUrl = photoUrl;
    }

    public String getName() { return name; }
    public String getRole() { return role; }
    public String getNationality() { return nationality; }
    public int getBirthYear() { return birthYear; }
    public String getBiography() { return biography; }
    public String getPhotoUrl() { return photoUrl; }
}
