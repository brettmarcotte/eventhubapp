package com.example.eventhub.Models;

public class ArtsFestivals {

    private String location;
    private int date;
    private int time;

    public ArtsFestivals(String location, int date, int time) {
        this.location = location;
        this.date = date;
        this.time = time;
    }

    public static void ArtsFestivalsMenu(){
        System.out.println("Select Arts Festival locations:");
        System.out.println("1. Fair Grounds");
        System.out.println("2. Schools");
        System.out.println("3. Restaurants");
        System.out.println("4.Country Clubs");
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
}
