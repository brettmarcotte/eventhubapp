package com.example.eventhub.Models;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/Karaoke")
public class Karaoke {

    @JsonProperty("location")
    private String location;

    @JsonProperty("genre")
    private String genre;

    @JsonProperty("date")
    private int date;

    @JsonProperty("time")
    private int time;

    public Karaoke(String location, String genre, int date, int time) {
        this.location = location;
        this.genre = genre;
        this.date = date;
        this.time = time;
    }

    public static void KaraokeMenu(){
        System.out.println("Karaoke Event Locations");
        System.out.println("1. Bars");
        System.out.println("2. Restaurants");
        System.out.println("3. Karaoke Clubs");
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
