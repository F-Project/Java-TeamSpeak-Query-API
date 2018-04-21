package com.gmail.luxdevpl.teamspeakapi.api;

public interface Client extends ClientInfo {

    void addPermission();

    String getAwayMessage();

    Channel getChannel();

    String getCountry();

    int getTalkPower();

    int getTalkRequest();

    String getTalkRequestMessage();

    String getVersion();

    boolean isAway();

    boolean isChannelCommander();

    boolean isMuted();

    boolean isPrioritySpeaker();

    boolean isRecording();

    void kick(String reason);

    void move(Channel destination);

    void poke(String message);

    void removePermission();
}
