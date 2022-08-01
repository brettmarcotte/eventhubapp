package com.example.eventhub.Models;

public class ParksAndRec {

    private String location;
    private int date;
    private int time;

    public ParksAndRec(String location, int date, int time) {
        this.location = location;
        this.date = date;
        this.time = time;
    }

    public static void ParksAndRecMenu(){
        System.out.println("Parks and Rec Menu");
        System.out.println("1. Sports");
        System.out.println("2. Hiking");
        System.out.println("3. Picnic areas");

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
