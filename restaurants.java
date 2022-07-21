package com.company.FoodFestivals;

public class restaurants {
    private String location;
    private int date;
    private int time;
    private String genre;
    private String cuisine;

    public restaurants(String location, int date, int time, String genre, String cuisine) {
        this.location = location;
        this.date = date;
        this.time = time;
        this.genre = genre;
        this.cuisine = cuisine;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }
}
