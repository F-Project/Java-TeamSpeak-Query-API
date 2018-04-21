package com.gmail.luxdevpl.teamspeakapi.query.event;

public abstract class Event {

    public String getEventName() {
        return this.getClass().getName();
    }
}
