package com.gmail.luxdevpl.teamspeakapi;

public interface IServerQuery {

    void start();

    void stop();

    void login(String username, String password);

    void logout();

    void query(String query);

    void selectById(int serverId, boolean virtual);

    void selectByPort(int port, boolean virtual);
}
