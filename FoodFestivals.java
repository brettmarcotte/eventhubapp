package com.example.eventhub.Models;

public class FoodFestivals {

    private String location;
    private int date;
    private int time;

    public FoodFestivals(String location, int date, int time) {
        this.location = location;
        this.date = date;
        this.time = time;
    }

    public static void FoodFestivalsMenu(){
        System.out.println("Food Festival Menu");
        System.out.println("1. Restaurants");
        System.out.println("2. Parks");
        System.out.println("3. Fair Grounds");
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
