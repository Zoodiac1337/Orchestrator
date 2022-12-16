package com.example.Orchestrator.trips;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;


@Repository
public interface TripsRepository extends JpaRepository<Trips, Integer> {
    Optional<Trips> findTripsByTripID(int TripID);
    Optional<ArrayList<Trips>> findTripsByUserID(int UserID);
    Optional<Trips> findTripsByTripIDAndUserID(int tripID, int userID);
    Optional<ArrayList<Trips>> findTripsByLocation(String Location);
}