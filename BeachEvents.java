package com.company.LocalMusic;

public class BeachEvents {

    private String location;
    private int date;
    private int time;
    private String event;
    private String sports;
    private String music;

    public BeachEvents(String location, int date, int time, String event, String sports, String music) {
        this.location = location;
        this.date = date;
        this.time = time;
        this.event = event;
        this.sports = sports;
        this.music = music;
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

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }
}
