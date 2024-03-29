package com.example.Orchestrator.users;

import jakarta.persistence.*;

@Entity
@Table
public class Users {
    @Id
    private int userID;
    private String username;
    private String password;

    public Users() {
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Users(int userID, String username, String password) {
        this.userID = userID;
        this.username = username;
        this.password = password;
    }

public int  getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
