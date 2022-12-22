package com.eazybytes.eazyschool.model;

public class Holiday {

    private final String day;
    private final String event;
    private final Type type;

    public String getDay() {
        return day;
    }

    public String getEvent() {
        return event;
    }

    public Type getType() {
        return type;
    }

    public enum Type{
        FESTIVAL, FEDERAL
    }

    public Holiday(String day, String event, Type type) {
        this.day = day;
        this.event = event;
        this.type = type;
    }
}
