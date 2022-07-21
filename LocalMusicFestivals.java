package com.company.LocalMusic;

public class LocalMusicFestivals {

    private String location;
    private int date;
    private int time;
    private String genre;
    private String size;

    public LocalMusicFestivals(String location, int date, int time, String genre, String size) {
        this.location = location;
        this.date = date;
        this.time = time;
        this.genre = genre;
        this.size = size;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
