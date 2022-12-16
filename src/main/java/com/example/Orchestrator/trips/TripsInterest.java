package com.example.Orchestrator.trips;

import jakarta.persistence.*;


@Entity
@Table
public class TripsInterest {


    private int tripID;
    private int userID;
    private String username;
    @Id
    @GeneratedValue
    private Long interestID;

    public TripsInterest() {
    }

    public TripsInterest(int tripID, int userID, String username) {
        this.tripID = tripID;
        this.userID = userID;
        this.username = username;
    }

    public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setInterestID(Long interestID) {
        this.interestID = interestID;
    }

    public Long getInterestID() {
        return interestID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
