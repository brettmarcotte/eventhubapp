package com.company.Trivia;

public class Bars {
    private String bars;
    private String locations;
    private String genre;
    private int date;
    private int time;

    public Bars(String bars, String locations, String genre, int date, int time) {
        this.bars = bars;
        this.locations = locations;
        this.genre = genre;
        this.date = date;
        this.time = time;
    }

    public static void barsMenu(){
        System.out.println("Select Event Type");
        System.out.println("1. Live Music Venue");
        System.out.println("2. Bars");
        System.out.println("3. Genre");
        System.out.println("4. Live Music Festival");
    }




    public String getBars() {
        return bars;
    }

    public void setBars(String bars) {
        this.bars = bars;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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


}
