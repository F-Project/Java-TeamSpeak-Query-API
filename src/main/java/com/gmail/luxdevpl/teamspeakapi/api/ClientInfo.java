package com.gmail.luxdevpl.teamspeakapi.api;

import com.gmail.luxdevpl.teamspeakapi.query.Fetchable;
import com.gmail.luxdevpl.teamspeakapi.query.Updateable;

public interface ClientInfo extends Fetchable, Updateable {

    String getUsername();

    String getDescription();

    String getIdentifier();

    int getId();

    int getDatabaseId();
}
