package com.example.Orchestrator.trips;

import com.example.Orchestrator.weather.*;
import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table
public class Trips {


    @Id
    private int tripID;
    private int userID;
    private String location;
    private LocalDate date;

    public Trips() {
    }

    public Trips(int tripID, int userID, String location, LocalDate date) {
        this.tripID = tripID;
        this.userID = userID;
        this.location = location;
        this.date = date;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
