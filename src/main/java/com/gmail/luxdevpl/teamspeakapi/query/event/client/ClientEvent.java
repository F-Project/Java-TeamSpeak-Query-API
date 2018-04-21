package com.gmail.luxdevpl.teamspeakapi.query.event.client;

import com.gmail.luxdevpl.teamspeakapi.api.ClientInfo;
import com.gmail.luxdevpl.teamspeakapi.query.event.QueryEvent;

public class ClientEvent extends QueryEvent {

    private final ClientInfo client;

    public ClientEvent(ClientInfo client){
        this.client = client;
    }

    public ClientInfo getClient() {
        return client;
    }

}
