package com.eazybytes.eazyschool.model;

public class Holiday {

    private final String day;
    private final String event;
    private final String type;

    public String getDay() {
        return day;
    }

    public String getEvent() {
        return event;
    }

    public String getType() {
        return type;
    }

    public enum Type{
        FESTIVAL, FEDERAL
    }

    public Holiday(String day, String event, String type) {
        this.day = day;
        this.event = event;
        this.type = type;
    }
}
