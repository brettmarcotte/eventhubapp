package com.example.eventhub.Models;

import javax.servlet.ServletOutputStream;

public class HolidayEvents {

    private String location;
    private int date;
    private int time;

    public HolidayEvents(String location, int date, int time) {
        this.location = location;
        this.date = date;
        this.time = time;
    }

    public static void HolidayEventsMenu(){
        System.out.println("Holiday Event Locations");
        System.out.println("1. Restaurants");
        System.out.println("2. Holiday Bazaars");
        System.out.println("3. Schools");
        System.out.println("4. Country Clubs");
        System.out.println("5. Parks/Rec");

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
