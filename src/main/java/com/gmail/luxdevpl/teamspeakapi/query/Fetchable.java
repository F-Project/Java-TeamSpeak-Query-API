package com.gmail.luxdevpl.teamspeakapi.query;

public interface Fetchable {

    void fetch();

    void fetch(Callback callback);
}
