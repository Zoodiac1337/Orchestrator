package com.example.Orchestrator.trips;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;


@Repository
public interface TripsInterestRepository extends JpaRepository<TripsInterest, Integer> {
    Optional<TripsInterest> findTripsInterestByTripIDAndUserID(int tripID, int userID);
    TripsInterest getTripsInterestByTripIDAndUserID(int tripID, int userID);
    Optional<ArrayList<TripsInterest>> findTripsInterestByUserID(int UserID);
    Optional<ArrayList<TripsInterest>> findTripsInterestByTripID(int TripID);
}